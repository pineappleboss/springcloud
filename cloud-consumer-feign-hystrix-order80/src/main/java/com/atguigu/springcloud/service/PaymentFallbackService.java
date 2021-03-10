package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/3/10 16:17
 * @describe
 */

@Component
public class PaymentFallbackService {

    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }


    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
