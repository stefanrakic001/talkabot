package com.codecool.talkabothausaufgabe.service;

import com.codecool.talkabothausaufgabe.model.HelloWorld;
import com.codecool.talkabothausaufgabe.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {


    @Autowired
    HelloWorldRepository helloWorldRepository;

    public List<HelloWorld> getHelloWorld() {
        return helloWorldRepository.findAll();
    }
}
