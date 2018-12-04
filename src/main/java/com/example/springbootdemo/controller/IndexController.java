package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : dongyu.jiang
 * @Date :create in  2018-12-4
 * @Desciption :
 **/
@RestController
@RequestMapping("")
public class IndexController {
    @RequestMapping("/main")
    public String index(){
        return "hello  spring demo";
    }
}
