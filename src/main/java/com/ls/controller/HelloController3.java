package com.ls.controller;

import com.ls.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by keke on 2017/10/18.
 * Controller的使用
 */

@Controller
@ResponseBody
public class HelloController3 {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String sayHello(){
        return girlProperties.getCupSize();
    }
}
