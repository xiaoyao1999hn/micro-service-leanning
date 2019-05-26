package org.xiaoyao.microservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/26 17:49
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
