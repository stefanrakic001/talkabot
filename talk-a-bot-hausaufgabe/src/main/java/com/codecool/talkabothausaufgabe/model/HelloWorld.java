package com.codecool.talkabothausaufgabe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public HelloWorld(){
        this.name = "helloWorld";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
