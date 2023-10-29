package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title TestController
 * @date 2023/10/25 21:25
 * @author ts happy boy
 * @description TODO
 */
@RestController
public class TestController {
    @GetMapping ("/hello")
    public String hello(){
        return "second";
    }
}



