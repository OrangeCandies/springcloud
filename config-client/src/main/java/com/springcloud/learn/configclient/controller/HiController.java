package com.springcloud.learn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    private String hi() {
        return foo;
    }
}
