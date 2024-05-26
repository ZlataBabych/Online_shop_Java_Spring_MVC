package com.example.shopping.controllers;

import com.example.shopping.models.Payment;
import com.example.shopping.models.Product;
import com.example.shopping.models.Seller;
import com.example.shopping.repositories.PaymentRepository;
import com.example.shopping.repositories.ProductRepository;
import com.example.shopping.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The SaleController class is a Spring Boot controller class for handling requests related to selling products.
 */
@Controller
@RequestMapping("/sell")
public class SaleController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    /**
     * This method is used to get the sell page.
     * @param model the model
     * @return the sell page
     */
    @GetMapping
    public String sellPage(Model model) {
        model.addAttribute("newSeller", new Seller());
        model.addAttribute("existingSeller", new Seller());
        return "sell";
    }

    /**
     * This method is used to add a seller.
     * @param seller the seller
     * @param model the model
     * @return the seller dashboard
     */
    @PostMapping("addSeller")
    public String addSeller(@ModelAttribute("newSeller") Seller seller, Model model) {
        sellerRepository.save(seller);
        return "redirect:dashboard?sellerId=" + seller.getId();
    }

    /**
     * This method is used to login a seller.
     * @param sellerId the seller ID
     * @param model the model
     * @return the seller dashboard
     */
    @PostMapping("loginSeller")
    public String loginSeller(@RequestParam Long sellerId, Model model) {
        Seller seller = sellerRepository.findById(sellerId).orElse(null);
        if (seller == null) {
            model.addAttribute("error", "Invalid seller ID");
            return "sell";
        }
        return "redirect:dashboard?sellerId=" + sellerId;
    }

    /**
     * This method is used to get the seller dashboard.
     * @param sellerId the seller ID
     * @param model the model
     * @return the seller dashboard
     */
    @GetMapping("/dashboard")
    public String sellerDashboard(@RequestParam Long sellerId, Model model) {
        Seller seller = sellerRepository.findById(sellerId).orElse(null);
        if (seller == null) {
            return "redirect:sell";
        }

        List<Product> products = productRepository.findBySellerId(sellerId);
        List<Payment> payments = paymentRepository.findBySellerCardNumber(seller.getCardNumber());

        model.addAttribute("seller", seller);
        model.addAttribute("products", products);
        model.addAttribute("payments", payments);
        model.addAttribute("newProduct", new Product());

        return "sellerDashboard";
    }

    /**
     * This method is used to add a product.
     * @param product the product
     * @param sellerId the seller ID
     * @return the seller dashboard
     */
    @PostMapping("addProduct")
    public String addProduct(@ModelAttribute("newProduct") Product product, @RequestParam Long sellerId) {
        Seller seller = sellerRepository.findById(sellerId).orElse(null);
        if (seller != null) {
            product.setSeller(seller);
            productRepository.save(product);
        }
        return "redirect:dashboard?sellerId=" + sellerId;
    }
}
