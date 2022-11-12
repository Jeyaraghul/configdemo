package com.rhlaab.configmap.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyCheck {
    @Value("${app.name}")
    private String appName;

    @Value("${app.desc}")
    private String appDesc;

    @GetMapping("/data")
    public String getApplicationDataName(){
        return " The Application Data name is " + appName +","+ "Description : " + appDesc ;
    }
    
}
