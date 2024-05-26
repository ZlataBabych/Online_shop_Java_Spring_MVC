package com.example.shopping.controllers;

import com.example.shopping.models.Product;
import com.example.shopping.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * The ProductController class is a Spring Boot controller class for handling requests related to products.
 */
@Controller
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    /**
     * This method is used to show all products.
     * @return the show all products page
     */
    @RequestMapping(value = "/showAllProducts", method = RequestMethod.GET)
    public ModelAndView showAllProducts() {
        List<Product> productList = (List<Product>) productRepository.findAll();
        return new ModelAndView("showAllProducts", "productList", productList);
    }

    /**
     * This method is used to buy a product.
     * @param id the product ID
     * @param model the model
     * @return the buy product page
     */
    @RequestMapping("/buyProduct")
    public String buyProduct(@RequestParam Long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("product", product);
        return "buyProduct";
    }
}
