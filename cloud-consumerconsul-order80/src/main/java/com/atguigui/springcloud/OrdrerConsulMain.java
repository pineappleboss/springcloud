package com.atguigui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrdrerConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrdrerConsulMain.class,args);
    }
}
