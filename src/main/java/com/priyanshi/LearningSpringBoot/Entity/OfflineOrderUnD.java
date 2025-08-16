package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OfflineOrderUnD")
public class OfflineOrderUnD implements OrderUnsatisfiedD{

    public OfflineOrderUnD(){
        System.out.println("Offline Order Initialized");
    }
}
