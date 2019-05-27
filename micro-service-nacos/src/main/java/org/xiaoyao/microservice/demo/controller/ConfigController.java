package org.xiaoyao.microservice.demo.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 添加RefreshScope后，如果nacos配置中心的信息发生变化会主动推送到我们的服务
 * 如下面的例子，如果修改了nacos配置中的username，我们访问/demo/getUserName接口得到的username也会变
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
