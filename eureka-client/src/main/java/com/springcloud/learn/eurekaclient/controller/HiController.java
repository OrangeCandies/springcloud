package com.springcloud.learn.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @Value("${server.port}")
    private String port;


    @GetMapping("/hi")
    public String hi(String name){
        return "Hi "+name+" i am from port:"+port;
    }
}
