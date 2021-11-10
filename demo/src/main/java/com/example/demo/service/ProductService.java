package com.example.demo.service;

import com.example.demo.model.Product;
import com.sun.istack.NotNull;
import org.springframework.validation.annotation.Validated;


@Validated
public interface ProductService {

    @NotNull
    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product product);
}
