package com.ts.controller.config;/**
 * @title RestConfig
 * @date 2023/10/25 21:38
 * @author ts happy boy
 * @description TODO
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.ts.controller.config
 * @Author: ts  happyBoy
 * @CreateTime: 2023-10-25  21:38
 * @Description: TODO
 * @Version: 1.0
 */

@Configuration
public class RestTemplateConfig {

    /**
     * 没有实例化RestTemplate时，初始化RestTemplate
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}



