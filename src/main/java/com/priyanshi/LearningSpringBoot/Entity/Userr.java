package com.priyanshi.LearningSpringBoot.Entity;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Userr {

    @Autowired
    Order order;


    @PostConstruct
    public void Initialize(){
        System.out.println("Bean has been constructed and dependency has been injected");
    }


    @PreDestroy
    public void PreDestroy(){
        System.out.println("Bean is about to destroy in PreDestroy");
    }
    public Userr(){
        System.out.println("Initializing User");
    }
}
