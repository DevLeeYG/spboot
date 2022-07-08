package com.springboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthy {

    @GetMapping("/hello")
    public String healthCheck(){
        return "server is healthy";
    }


}
