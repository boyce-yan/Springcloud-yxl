package com.yxl.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{


    @Override
    public String paymentInfo_OK(Integer id) {
        return "错误";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "错误";
    }
}
