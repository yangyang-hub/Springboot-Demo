package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author:yangyang
 * @date:2019/9/25
 * @descriptiom:
 */
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Value("${itcast.url}")
    private String itcast;

    @Value("${itheima.url}")
    private String itheima;

    @GetMapping("hello")
    public String hello(){
        System.out.println("dataSource:"+dataSource);
        System.out.println("itcast:"+itcast);
        System.out.println("itheima:"+itheima);
        return "hello,spring boot";
    }

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
