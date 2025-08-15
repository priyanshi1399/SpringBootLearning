package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderExFieldInjection {


    public OrderExFieldInjection(){
        System.out.println("Order Intiliazed example of Field Injection");
    }

    public void process() {
        System.out.println("Order processed");
    }


}
