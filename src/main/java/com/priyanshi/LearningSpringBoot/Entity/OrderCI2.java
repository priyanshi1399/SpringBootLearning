package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderCI2 {

    public OrderCI2(){
        System.out.println("Order Initilized checking for constructor Injection");
    }
}
