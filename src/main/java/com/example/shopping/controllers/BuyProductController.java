package com.example.shopping.controllers;

import com.example.shopping.models.Payment;
import com.example.shopping.models.Product;
import com.example.shopping.repositories.PaymentRepository;
import com.example.shopping.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The BuyProductController class is a Spring Boot controller class for handling requests to buy a product.
 */
@Controller
public class BuyProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PaymentRepository paymentRepository;


    /**
     * This method is used to buy a product.
     * @param productId the product ID
     * @param customerCardNumber the customer card number
     * @param customerFirstName the customer first name
     * @param customerLastName the customer last name
     * @param customerEmail the customer email
     * @param model the model
     * @return the bought product page
     */
    @RequestMapping(value = "/buyProduct", method = RequestMethod.POST)
    public String buyProduct(@RequestParam Long productId, @RequestParam String customerCardNumber,
                             @RequestParam String customerFirstName, @RequestParam String customerLastName,
                             @RequestParam String customerEmail, Model model) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + productId));

        Payment payment = new Payment();
        payment.setSellerCardNumber(product.getSeller().getCardNumber());
        payment.setCustomerCardNumber(customerCardNumber);
        payment.setAmount(product.getPrice());
        paymentRepository.save(payment);

        productRepository.delete(product);

        model.addAttribute("product", product);

        return "boughtProduct";
    }
}
