package com.ts.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @title PaymentHystrixService
 * @date 2023/10/29 22:51
 * @author ts happy boy
 * @description TODO
 */

@Component
@FeignClient(value = "HYSTRIX8001")
public interface PaymentHystrixService {
    @GetMapping("/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping("/error/{id}")
    public String paymentInfo_error(@PathVariable("id") Integer id);

}



