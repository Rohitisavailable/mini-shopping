package com.example.shopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ShoppingController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product(1, "Laptop", 1200.00),
            new Product(2, "Smartphone", 800.00),
            new Product(3, "Headphones", 150.00)
        );
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Shopping Site is UP and Running!";
    }
}
