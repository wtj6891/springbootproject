package com.hello.springbootproject.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******
 *Name: HelloController
 *User: Administrator
 *Date: 2019/4/27
 **/
@Api(value = "消息", description = "消息操作 API", position = 100, protocols = "http")
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world!";
    }
}
