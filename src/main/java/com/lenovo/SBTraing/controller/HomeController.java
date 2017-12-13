package com.lenovo.SBTraing.controller;

import com.lenovo.SBTraing.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @Autowired
    ConfigBean configbean;

    @RequestMapping("/")
    public String home(){
        return configbean.getName() + configbean.getWant();
    }

}