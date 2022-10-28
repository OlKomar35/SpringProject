package com.komar;

import com.komar.cart.CartStoreService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.komar");
        CartStoreService cartStoryService1=context.getBean(CartStoreService.class);

        cartStoryService1.createCart(2L);
        cartStoryService1.createCart(1L);
        cartStoryService1.createCart(3L);
        cartStoryService1.createCart(4L);
        cartStoryService1.printCartList();


        CartStoreService cartStoryService2=context.getBean(CartStoreService.class);

        cartStoryService2.createCart(1L);
        cartStoryService2.createCart(5L);
        cartStoryService2.createCart(6L);
        cartStoryService2.createCart(4L);
        cartStoryService2.printCartList();


        CartStoreService cartStoryService3=context.getBean(CartStoreService.class);

        cartStoryService3.addAllProductsInCart();
        cartStoryService3.printCartList();

        context.close();

    }
}