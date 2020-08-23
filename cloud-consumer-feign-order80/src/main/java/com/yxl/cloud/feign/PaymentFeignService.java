package com.yxl.cloud.feign;

import com.yxl.cloud.po.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //作为feign的接口，找CLOUD-PAYMENT-SERVICE服务
public interface PaymentFeignService {

    //直接复制8001的方法
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

}
