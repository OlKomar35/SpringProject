package com.komar.product;

import lombok.Data;

@Data
public class Product {
    private final Long id;
    private final String title;
    private final int price;

    @Override
    public String toString() {
        return title+" "+price+"$";
    }
}
