package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "TV Set", 300.00, "Electronics"));
            productService.save(new Product(2L, "Game Console", 200.00, "Game"));
            productService.save(new Product(3L, "Sofa", 100.00, "Home Appliences"));
            productService.save(new Product(4L, "Icecream", 5.00, "Home Appliences"));
            productService.save(new Product(5L, "Chair", 3.00, "Home Appliences"));
            productService.save(new Product(6L, "Phone", 500.00, "Electronics"));
            productService.save(new Product(7L, "Watch", 30.00, "Electronics"));
        };
    }

}
