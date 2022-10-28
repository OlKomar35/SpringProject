package com.komar.product;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
    List<Product>allProducts();
    Product findById(Long id);

}
