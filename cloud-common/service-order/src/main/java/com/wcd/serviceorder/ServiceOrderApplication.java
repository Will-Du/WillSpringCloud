package com.wcd.serviceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }

    /**
     * @Description: 向spring容器中注入RestTemplate
     *
     * @Author: Will
     * @Date: 2020/4/20  23:30
    */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
