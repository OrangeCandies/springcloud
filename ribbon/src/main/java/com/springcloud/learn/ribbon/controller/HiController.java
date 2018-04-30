package com.springcloud.learn.ribbon.controller;

import com.springcloud.learn.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String testRibbon(String name){
        return ribbonService.hi(name);
    }
}
