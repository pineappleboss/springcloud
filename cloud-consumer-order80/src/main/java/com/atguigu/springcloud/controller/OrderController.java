package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    private final String paymentUrl = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/consumer/create")
    public CommonResult<Payment> create(Payment payment) {
    return restTemplate.postForObject(paymentUrl+"/payment/create",payment,CommonResult.class);

    }

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(paymentUrl+"/payment/get/"+id,CommonResult.class);
    }

}
