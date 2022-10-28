package com.komar.product;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
@Primary
public class ProductStoreRepository implements ProductRepository{
    public List<Product> products;

    @PostConstruct
    public void init(){
        this.products=new ArrayList<>(Arrays.asList(
                new Product(1L, "Banana",3),
                new Product(2L, "Apple",2),
                new Product(3L, "Plum",1),
                new Product(4L, "Orange",2),
                new Product(5L, "Pear",3),
                new Product(6L, "Kiwi",5)
        ));
    }

    @Override
    public List<Product> allProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());
    }
}
