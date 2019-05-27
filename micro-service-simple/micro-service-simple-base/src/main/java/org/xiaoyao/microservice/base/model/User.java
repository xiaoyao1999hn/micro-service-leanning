package org.xiaoyao.microservice.base.model;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/5/27 15:54
 **/
public class User {

    String username;

    String password;

    Integer age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
