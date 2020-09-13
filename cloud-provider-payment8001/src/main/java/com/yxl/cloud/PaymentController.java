package com.yxl.cloud;

import com.yxl.cloud.entities.Payment;
import com.yxl.cloud.po.CommonResult;
import com.yxl.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment/")
@Slf4j  //日志
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    //前后端分离，所以不能直接返回对象，数据要先经过CommonResult封装再返回
    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入的数据为：" + payment);
        log.info("******插入结果：" + result);
        //插入成功
        return new CommonResult(200, "插入数据库成功", result);
    }


    @GetMapping("get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果：" + payment);
        if(payment != null){
            //查询成功
            return new CommonResult(200, "查询成功", payment);
        }else{
            return new CommonResult(444, "没有对应记录，查询ID：" + id);
        }
    }
}
