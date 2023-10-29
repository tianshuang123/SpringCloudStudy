package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ts happy boy
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Hystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix8001.class,args);
    }
}