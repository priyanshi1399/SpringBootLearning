package com.priyanshi.LearningSpringBoot.Entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserUnsatisfiedD {



   @Autowired
   @Qualifier("OfflineOrderUnD")
    OrderUnsatisfiedD orderunsatisfied;

    public UserUnsatisfiedD(){
        System.out.println("Unsatisfied Example : User Intialized");
    }


}
