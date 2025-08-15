package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class InvoiceCI2 {

    public InvoiceCI2(){
        System.out.println("Invoice initilized checking for cunstructor injection");
    }
}
