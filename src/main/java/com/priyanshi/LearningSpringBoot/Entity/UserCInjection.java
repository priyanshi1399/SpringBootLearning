package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCInjection {

    OrderCInjection ordercInject;

    @Autowired
    public UserCInjection(){
        System.out.println("User Intilaized for constructor Injection");
    }
}
