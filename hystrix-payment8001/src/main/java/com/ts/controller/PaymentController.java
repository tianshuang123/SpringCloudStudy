package com.ts.controller;

import com.ts.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title PaymentController
 * @date 2023/10/29 22:20
 * @author ts happy boy
 * @description TODO
 */

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;
    @GetMapping("/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_ok(id);
        log.info("********result"+result);
        return result;
    }

    @GetMapping("/error/{id}")
    public String paymentInfo_error(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_error(id);
        log.info("********result"+result);
        return result;
    }
}



