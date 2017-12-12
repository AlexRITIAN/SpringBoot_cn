package com.lenovo.SBTraing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController{

    @Value("${com.lenovo.SBTraing.home.name}")
    private String name;

    @Value("${com.lenovo.SBTraing.home.want}")
    private String want;

    @RequestMapping("/")
    public String home(){
        return name + want;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeController.class, args);
    }
}