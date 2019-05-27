package org.xiaoyao.microservice.demo.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xiaoyao.microservice.base.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 16:03
 **/

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping("/getUser")
    public Object getUser(){
        User user =new User();
        user.setAge(15);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping("/getUserList")
    public Object getUserList(){
        List<User> list=new ArrayList<User>();
        for(int i=0;i<10;i++){
            User user =new User();
            user.setAge(15+i);
            user.setUsername("zhangsan"+i);
            user.setPassword("123456");
            list.add(user);
        }
        return list;
    }

}
