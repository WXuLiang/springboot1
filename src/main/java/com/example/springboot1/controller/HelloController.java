package com.example.springboot1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${server.port}")
    public String post;
    @Value("${com.forezp.name}")
    public String com;
    @RequestMapping("/hi")
    public String index() {
        return "我的端口是"+post+":"+com;
    }

}
