package com.codecool.talkabothausaufgabe.config;

import com.codecool.talkabothausaufgabe.model.HelloWorld;
import com.codecool.talkabothausaufgabe.repository.HelloWorldRepository;
import org.springframework.stereotype.Component;

@Component
public class Init {


    public Init(HelloWorldRepository helloWorldRepository) {
        helloWorldRepository.save(new HelloWorld());
    }
}
