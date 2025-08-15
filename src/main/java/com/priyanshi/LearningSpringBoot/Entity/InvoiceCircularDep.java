package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class InvoiceCircularDep {

    @Lazy
    @Autowired
    OrderCircDep orderCir;

    public InvoiceCircularDep(){
        System.out.println("Invoice Circular Dependency");
    }
}
