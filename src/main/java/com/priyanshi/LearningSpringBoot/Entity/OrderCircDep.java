package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderCircDep {


    @Autowired
    InvoiceCircularDep userCir;

    public OrderCircDep(){
        System.out.println("Order Circular Dependency");
    }
}
