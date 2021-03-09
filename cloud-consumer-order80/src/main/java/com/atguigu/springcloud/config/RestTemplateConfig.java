package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
<<<<<<< Updated upstream
    @LoadBalanced
=======
    @LoadBalanced      //赋予 restTemplate负载均衡能力
>>>>>>> Stashed changes
    public RestTemplate get(){
        return new RestTemplate();
    }
}
