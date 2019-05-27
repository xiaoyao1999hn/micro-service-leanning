package org.xiaoyao.microservice.demo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 15:59
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SimpleProducerApp {
    public static void main(String[] args){
        SpringApplication.run(SimpleProducerApp.class, args);
    }
}