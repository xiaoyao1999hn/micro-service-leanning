package org.xiaoyao.microservice.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.xiaoyao.microservice.base.model.User;
import org.xiaoyao.microservice.demo.consumer.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 15:54
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    private static  final String REST_URL="http://micro-service-simple-producer";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByRestTemplate")
    public Object getUserByRestTemplate(){
//        这里如果没有用LoadBlanced来注入RestTemplate就需要用完整的url路径
//               RestTemplate restTemplate =new  RestTemplate();
//               return restTemplate.getForObject("http://localhost:8082/producer/getUser",User.class);

        return restTemplate.getForObject(REST_URL+"/producer/getUser",User.class);
    }


    @RequestMapping("/getUserByFeign")
    public Object getUserByFeign(){
        return userService.getUser();
    }

    @RequestMapping("/getUserListByRestTemplate")
    public Object getUserListByRestTemplate(){
        RestTemplate restTemplate =new RestTemplate();
        return restTemplate.getForObject(REST_URL+"/producer/getUserList",User.class);
    }


    @RequestMapping("/getUserListByFeign")
    public Object getUserListByFeign(){
        return userService.getUserList();
    }

}
