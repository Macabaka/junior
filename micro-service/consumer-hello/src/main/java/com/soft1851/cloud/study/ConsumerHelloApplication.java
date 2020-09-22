package com.soft1851.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Johnny
 * @Date: 2020/9/14 08:42
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHelloApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
