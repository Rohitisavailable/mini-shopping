package com.example.shopping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class ShoppingController {

    @GetMapping("/")
    public String home() {
        return "index"; // Returns index.html
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 1200.00),
            new Product(2, "Smartphone", 800.00),
            new Product(3, "Headphones", 150.00)
        );
        model.addAttribute("products", products);
        return "products"; // Returns products.html
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Shopping Site is UP and Running!";
    }
}
