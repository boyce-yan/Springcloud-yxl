package com.yxl.cloud.controller;

import com.yxl.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderNacosController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/feign/nacos/{id}")
    public String paymentInfo2(@PathVariable("id") Integer id){
        return paymentFeignService.getPayment(id);
    }

}
