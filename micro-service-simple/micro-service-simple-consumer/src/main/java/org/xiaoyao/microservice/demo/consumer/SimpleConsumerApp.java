package org.xiaoyao.microservice.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 15:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SimpleConsumerApp {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(SimpleConsumerApp.class, args);
    }
}
