package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCI2 {

    OrderCI2 orderConstructorInjection;
    InvoiceCI2 invoiceConstructorInjection;

    public UserCI2(OrderCI2 orderConstructorInjection){
        this.orderConstructorInjection=orderConstructorInjection;
        System.out.println("User initilized with only order");
    }

    @Autowired
    public UserCI2(InvoiceCI2 invoiceConstructorInjection){
        this.invoiceConstructorInjection=invoiceConstructorInjection;
        System.out.println("User Initilized with only invoice");
    }
}
