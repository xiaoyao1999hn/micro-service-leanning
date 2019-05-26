package org.xiaoyao.microservice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/19 13:11
 **/
@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
