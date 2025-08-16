package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OnlineOrderUnD")
public class OnlineOrderUnD implements OrderUnsatisfiedD{

    public OnlineOrderUnD(){
        System.out.println("Online Order Initialized");
    }
}
