package com.yxl.cloud.service;

import com.yxl.cloud.entities.Payment;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
