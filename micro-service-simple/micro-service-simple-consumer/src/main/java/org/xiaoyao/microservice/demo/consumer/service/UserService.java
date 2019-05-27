package org.xiaoyao.microservice.demo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 17:44
 **/
@FeignClient(name = "micro-service-simple-producer")
public interface UserService {

    @GetMapping(value = "/producer/getUser")
    Object getUser();

    @GetMapping(value = "/producer/getUserList")
    Object getUserList();

}
