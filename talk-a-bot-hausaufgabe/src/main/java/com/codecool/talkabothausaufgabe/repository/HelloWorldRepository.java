package com.codecool.talkabothausaufgabe.repository;

import com.codecool.talkabothausaufgabe.model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;



public interface HelloWorldRepository extends JpaRepository<HelloWorld,Integer> {

}
