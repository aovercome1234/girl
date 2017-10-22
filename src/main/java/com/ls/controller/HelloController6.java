package com.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by keke on 2017/10/18.
 * Controller的使用
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController6 {

    //路径为：localhost:8082/hello/sayHello/id
    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id){
        return "id: "+id;
    }

    //路径为：localhost:8082/hello/sayHello2?id=xxx
    @RequestMapping(value = "/sayHello2", method = RequestMethod.GET)
    public String sayHello2(@RequestParam("id") Integer id){
        return "Hi, id: "+id;
    }

    //路径为：localhost:8082/hello/sayHello3, 如果没传id，给id设置个默认值，注意 defaultValue后面跟的是字符串
    @RequestMapping(value = "/sayHello3", method = RequestMethod.GET)
    public String sayHello3(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        return "Hi, id: "+id;
    }

    //简化上面的RequestMapping
    //请求URL：http://localhost:8082/girl/hello/sayHello4
    @GetMapping(value = "/sayHello4")
//    @PostMapping  @PutMapping  @DeleteMapping
    public String sayHello4(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        return "Hi, id: "+id;
    }
}
