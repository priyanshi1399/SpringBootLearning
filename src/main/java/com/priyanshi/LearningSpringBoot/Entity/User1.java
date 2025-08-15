package com.priyanshi.LearningSpringBoot.Entity;

import org.springframework.stereotype.Component;



public class User1 {

    String username;
    String email;

    public User1(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
