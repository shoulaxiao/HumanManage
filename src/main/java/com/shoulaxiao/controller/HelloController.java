package com.shoulaxiao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping(value = "/hellowelcome")
    public String Hello(){
        return "success";
    }
}
