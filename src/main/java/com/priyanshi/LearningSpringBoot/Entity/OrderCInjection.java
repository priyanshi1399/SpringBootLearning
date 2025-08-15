package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderCInjection {

  public OrderCInjection(){

      System.out.println("Order Initilization for constructor injection");
  }
}
