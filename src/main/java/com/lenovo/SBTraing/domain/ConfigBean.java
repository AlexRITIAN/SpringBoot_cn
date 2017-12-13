package com.lenovo.SBTraing.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="com.yuhao.test")
@PropertySource("classpath:test.properties")
public class ConfigBean{
    private String name;
    private String want;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWant(String want){
        this.want = want;
    }

    public String getWant(){
        return want;
    }
}