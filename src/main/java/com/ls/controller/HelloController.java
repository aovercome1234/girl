package com.ls.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by keke on 2017/10/18.
 */
@RestController
public class HelloController {

    //获取配置文件中的值
    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    //在配置中使用配置
    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello  "+content;
    }
}
