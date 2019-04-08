package com.codecool.talkabothausaufgabe.controller;


import com.codecool.talkabothausaufgabe.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;


    @GetMapping(value = "/")
    public String getHelloWorld () {
        return helloWorldService.getHelloWorld().get(0).getName();
    }
}
