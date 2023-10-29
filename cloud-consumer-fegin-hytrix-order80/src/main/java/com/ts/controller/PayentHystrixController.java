package com.ts.controller;

import com.ts.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title PamentHystrixController
 * @date 2023/10/29 22:54
 * @author ts happy boy
 * @description TODO
 */

@RestController
@Slf4j
public class PayentHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_ok(id);
        log.info("********result"+result);
        return result;
    }

    @GetMapping("/consumer/error/{id}")
    public String paymentInfo_error(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_error(id);
        log.info("********result"+result);
        return result;
    }

}



