package com.ts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title TestController
 * @date 2023/10/29 20:21
 * @author ts happy boy
 * @description TODO
 */

@RestController
public class TestController {
//    @Value("${config.info}")
    private String appName;

    @GetMapping("hello")
    public String hello(){
        return appName;
    }

}



