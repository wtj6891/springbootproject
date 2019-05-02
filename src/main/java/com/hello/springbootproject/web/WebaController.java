package com.hello.springbootproject.web;

import com.hello.springbootproject.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******
 *Name: WebaController
 *User: Administrator
 *Date: 2019/4/28
 **/
@RestController
public class WebaController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setName("zhang san");
        user.setAge(28);
        user.setPass("Pass");
        return user;
    }
}
