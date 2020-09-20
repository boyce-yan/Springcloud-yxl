package com.yxl.cloud.service.impl;

import com.yxl.cloud.entities.Payment;
import com.yxl.cloud.po.CommonResult;
import com.yxl.cloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}
