package com.komar.cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CartStoreService {
    private final CartStoreRepository cartStoreRepository;

    @Autowired
    public CartStoreService(CartStoreRepository cartStoreRepository) {

        this.cartStoreRepository = cartStoreRepository;
    }

    public void createCart(Long productId) {
        cartStoreRepository.addProduct(productId);
    }

    public void addAllProductsInCart() {
        cartStoreRepository.allListProductsInCart();
    }

    public void printCartList() {
        System.out.printf("Новая корзина создана %n");
        System.out.println(cartStoreRepository.getCartList());
        System.out.println();

    }

    public void removeProduct(long productId) {
        cartStoreRepository.removeProduct(productId);
    }
}
