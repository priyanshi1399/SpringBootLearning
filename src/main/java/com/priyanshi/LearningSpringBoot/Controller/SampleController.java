package com.priyanshi.LearningSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class SampleController {

    @GetMapping(path="/fetchUser")
    public String getUserDetails(@RequestParam (name="firstName") String firstName,
                                  @RequestParam(name="lastName" ,required=false)String lastName,
                                 @RequestParam(name="age")int age){
        return "fetching and returning user details based on firstName=" +firstName +  "lastName ="+ lastName +"and age is "+age;
    }

}
