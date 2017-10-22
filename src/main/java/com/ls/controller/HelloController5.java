package com.ls.controller;

import com.ls.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by keke on 2017/10/18.
 * Controller的使用
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController5 {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHello(){
        return girlProperties.getCupSize();
    }
}
