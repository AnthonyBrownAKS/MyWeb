package com.anthony.hmweb;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 处理请求类
@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello(String name,Integer age){
        System.out.println(name+":"+age);
        return "OK";
    }

}
