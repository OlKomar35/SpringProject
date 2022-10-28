package com.komar.cart;

import com.komar.product.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Scope("prototype")
public interface CartRepository {

    List<Product> allProductsInCart();
    void addProduct(Long id);
    void removeProduct(Long id);
}
