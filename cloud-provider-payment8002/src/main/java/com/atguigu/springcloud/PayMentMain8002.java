package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/3/3 9:41
 * @describe
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8002.class,args);
    }
}
