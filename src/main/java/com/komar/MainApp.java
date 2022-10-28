package com.komar;

import com.komar.cart.CartStoryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.komar");
        CartStoryService cartStoryService=context.getBean(CartStoryService.class);

        cartStoryService.createCart(2L);
        cartStoryService.createCart(1L);
        cartStoryService.createCart(3L);
        cartStoryService.createCart(4L);

        context.close();

    }
}