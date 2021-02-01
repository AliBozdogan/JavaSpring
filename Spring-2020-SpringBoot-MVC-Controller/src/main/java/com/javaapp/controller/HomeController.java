package com.javaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/ozzy")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value ="/javaapp")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring")
    public String postMappingEx2(){
        return "home";
    }

}
