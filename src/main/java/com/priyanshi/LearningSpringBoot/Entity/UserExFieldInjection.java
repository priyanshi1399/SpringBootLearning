package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserExFieldInjection {

    @Autowired
    //public final OrderExFieldInjection orderEx=null;
    public OrderExFieldInjection orderEx;


    public UserExFieldInjection(){
        System.out.println("user Intilaized example of field Injection");
    }


    public void process(){
        orderEx.process();
    }
}

