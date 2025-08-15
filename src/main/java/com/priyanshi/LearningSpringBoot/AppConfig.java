package com.priyanshi.LearningSpringBoot;

import com.priyanshi.LearningSpringBoot.Entity.User1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User1 createUser(){
        System.out.println("Priority if component & configuration");
        return new  User1("defaultUsername","defaultEmail");

    }

}
