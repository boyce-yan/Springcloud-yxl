package com.yxl.cloud.service.impl;

import com.yxl.cloud.mapper.PaymentMapper;
import com.yxl.cloud.entities.Payment;
import com.yxl.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentSweviceImpl implements PaymentService {

    @Resource   //@Autowired也可以
    private PaymentMapper paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
