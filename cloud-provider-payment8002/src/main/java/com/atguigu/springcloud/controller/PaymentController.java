package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Resource
    PaymentService paymentService;
    @Value("${server.port}")
    private String serverPoint;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200 , "数据插入成功" ,result);

        }else{
            return new CommonResult(200 , "数据插入失败" ,result);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        return new CommonResult(200,""+serverPoint,result);
    }

    @GetMapping("/discovery/get")
    public CommonResult getService8Instances() {
        List<String> services = discoveryClient.getServices();//获取服务
        services.stream().forEach(x->log.info(x));
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");//获取服务中的实例，一个服务可能包含多个实例
        instances.stream().forEach(x->{log.info(x.getInstanceId()+"--"+x.getHost());});
        return new CommonResult(200,""+serverPoint,discoveryClient);
    }
}
