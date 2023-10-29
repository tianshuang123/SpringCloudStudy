package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ts happy boy
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 * @description TODO
 */

@SpringBootApplication
@EnableEurekaClient
public class SecondWeb {
    public static void main(String[] args) {
        SpringApplication.run(SecondWeb.class,args);
    }
}