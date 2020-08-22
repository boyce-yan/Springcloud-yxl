package com.yxl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient    //该注解用于向使用consul或者Zookeeper作为注册中心时注册服务
@SpringBootApplication
public class Payment8006 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006.class, args);
    }
}