package com.ts.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @title PaymentService
 * @date 2023/10/29 22:02
 * @author ts happy boy
 * @description TODO
 */
@Service
public class PaymentService {
    public String paymentInfo_ok(Integer id){
        return "线程池  "+Thread.currentThread().getName()+"  paymentInfo_ok" +id+"\t"+"O(∩_∩)O哈哈~";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_errorHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })
    public String paymentInfo_error(Integer id){
        try {
            TimeUnit.SECONDS.sleep(5);
            return "线程池  "+Thread.currentThread().getName()+"  paymentInfo_error" +id+"\t"+"┭┮﹏┭┮";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String paymentInfo_errorHandler(Integer id){
        return "线程池  "+Thread.currentThread().getName()+"  paymentInfo_errorHandler" +id+"\t"+"兜底";
    }

}



