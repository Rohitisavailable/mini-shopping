package com.example.shopping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingTests {

    @Test
    public void testProductCreation() {
        Product product = new Product(1, "Test Product", 10.0);
        assertEquals("Test Product", product.getName());
        assertEquals(10.0, product.getPrice());
    }
}
