package com.springcloud.learn.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    private int port;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
