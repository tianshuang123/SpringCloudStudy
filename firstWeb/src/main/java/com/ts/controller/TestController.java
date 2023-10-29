package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.ts.controller
 * @Author: ts  happyBoy
 * @CreateTime: 2023-10-25  21:20
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class TestController {
    public static final String URL = "http://SECOND-WEB";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return restTemplate.getForObject("http://SECOND-WEB/hello",String.class);
    }
}



