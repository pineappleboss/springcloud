package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    @GetMapping("/get/uuid")
    public String getMessage(){
        return UUID.randomUUID().toString();
    }
}
