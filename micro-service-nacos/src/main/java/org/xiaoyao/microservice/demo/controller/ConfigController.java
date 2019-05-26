package org.xiaoyao.microservice.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/26 17:49
 **/
@RestController
@RequestMapping("/demo")
@RefreshScope
public class ConfigController {

    @Value("${demo.config.username}")
    String userName;

    @RequestMapping("/getUserName")
    public String getUserName(){

        return userName;
    }

}
