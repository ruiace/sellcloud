package com.ruipeng.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2017-12-10 20:37
 */
@RestController

public class ServerController {

    @Value("${env}")
    private String env;

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg";
    }

    @GetMapping("/env")
    @RefreshScope
    public String env(){
        return env;
    }
}
