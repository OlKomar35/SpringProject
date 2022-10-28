package com.komar.cart;

import com.komar.product.ProductStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartStoryService {
    int count = 0;

    private ProductStoreService productStoreService;

    private CartStoreRepository cartStoreRepository;

    @Autowired
    public CartStoryService(ProductStoreService productStoreService, CartStoreRepository cartStoreRepository) {
        this.productStoreService = productStoreService;
        this.cartStoreRepository = cartStoreRepository;
    }

    public void createCart(Long productId) {
        System.out.printf("Корзина создана %s%n", ++count);
        System.out.println(productStoreService.getTitleById(productId));
    }
}
