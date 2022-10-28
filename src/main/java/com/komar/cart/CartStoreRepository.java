package com.komar.cart;

import com.komar.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CartStoreRepository implements CartRepository {
    List<Product> productList;
    List<Product> cartList = new ArrayList<>();



    public void setProductsList(List<Product> productList) {
        this.productList = productList;
    }


    @Override
    public List<Product> allProductsInCart() {
        return productList;
    }



    @Override
    public void addProduct(Long id) {

    }

    @Override
    public void removeProduct(Long id) {

    }
}
