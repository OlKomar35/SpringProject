package com.komar.cart;

import com.komar.product.Product;
import com.komar.product.ProductStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class CartStoreRepository implements CartRepository {
    private final ProductStoreRepository productStoreRepository;

    @Autowired
    public CartStoreRepository(ProductStoreRepository productStoreRepository) {
        this.productStoreRepository = productStoreRepository;
    }

    List<Product> cartList = new ArrayList<>();

    public List<Product> getCartList() {
        return this.cartList;
    }

    @Override
    public List<Product> allListProductsInCart() {
        this.cartList = productStoreRepository.allProducts();
        return this.cartList;
    }

    @Override
    public void addProduct(Long id) {
        this.cartList.add(productStoreRepository.findById(id));
    }

    @Override
    public void removeProduct(Long id) {
        cartList.remove(productStoreRepository.findById(id));
    }
}
