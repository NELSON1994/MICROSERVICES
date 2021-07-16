package com.microservice2.microservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/amazon-payment")
    public String invokePaymentService(@PathVariable int price){
    String url="http://localhost:8888/payment-provider/payNow/"+price;//for payment // without eureka client
        String url1="http://PAYMENT-PROVIDER-SERVICE/payment-provider/payNow/"+price;//for payment // eureka client( USE THE SERVICE NAME REGISTERED ON EUREKA)
        return restTemplate.getForObject(url1,String.class);
    }
}
