package com.hello.springbootproject;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/******
 *Name: ServletInitializer
 *User: Administrator
 *Date: 2019/5/2
 **/
public class ServletInitializer extends SpringBootServletInitializer {

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootprojectApplication.class);
    }
}
