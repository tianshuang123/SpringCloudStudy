package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ts happy boy
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OPenFegin {
    public static void main(String[] args) {
        SpringApplication.run(OPenFegin.class,args);
    }
}