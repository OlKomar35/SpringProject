package com.komar.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductStoreService {
    private ProductStoreRepository productRepository;

    @Autowired
    public void setProductRepository(ProductStoreRepository productRepository){
        this.productRepository=productRepository;
    }
    public String getTitleById(Long id){
        return productRepository.findById(id).getTitle();
    }
}
