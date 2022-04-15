package com.example.petstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping("/index.html")
    public String index() {
        return "index";
    }

    @GetMapping("/shop-left-sidebar.html")
    public String shop() {
        return "shop-left-sidebar.html";
    }

    @GetMapping("/blog-left-sidebar.html")
    public String blog() {
        return "blog-left-sidebar.html";
    }

    @GetMapping("/about.html")
    public String about() {
        return "about.html";
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "contact.html";
    }

    @GetMapping("/my-account.html")
    public String my_account() {
        return "my-account.html";
    }

    @GetMapping("/cart.html")
    public String cart() {
        return "cart.html";
    }

    @GetMapping("/single-product.html")
    public String single_product() {
        return "single-product.html";
    }

    @GetMapping("/register.html")
    public String register() {
        return "register.html";
    }

    @GetMapping("/login")
    public String getLoginView(){
        return "login";
    }
}
