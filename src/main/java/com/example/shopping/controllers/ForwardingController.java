package com.example.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * The ForwardingController class is a Spring Boot controller class for handling requests to forward to other pages.
 */
@Controller
public class ForwardingController {

    /**
     * This method is used to forward to the show all products page.
     * @return the show all products page
     */
    @PostMapping("/buy")
    public String buyProducts() {
        return "redirect:/showAllProducts";
    }

    /**
     * This method is used to forward to the sell page.
     * @return the sell page
     */
    @PostMapping("/sell")
    public String sellProducts() {
        return "redirect:/sell";
    }

}


