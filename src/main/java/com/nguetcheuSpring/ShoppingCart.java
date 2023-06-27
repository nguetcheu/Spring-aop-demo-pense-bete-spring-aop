package com.nguetcheuSpring;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {


    public void checkout(String status){
        //logging
        //Authentication & Authorization
        //Sanitize the Data
        System.out.println("Checkout method from ShoppingCart called");
    }

    public int quantity() {
        return 2;
    }
}
