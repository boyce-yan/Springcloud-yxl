package com.yxl.cloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PaymentController {

    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "paymentZipkin...";
    }
}
