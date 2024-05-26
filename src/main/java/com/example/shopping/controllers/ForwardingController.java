package com.example.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    @PostMapping("/buy")
    public String buyProducts() {
        return "redirect:/showAllProducts";
    }

    @PostMapping("/sell")
    public String teacherLogin() {
        return "redirect:/sale";
    }

}


