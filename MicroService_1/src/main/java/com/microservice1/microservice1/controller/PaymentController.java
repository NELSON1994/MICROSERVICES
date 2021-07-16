package com.microservice1.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
    @GetMapping("/payNow/{price}")
    public String demo(@PathVariable int price){
        return "You have paid : "+ price + " . Thank You";
    }
}
