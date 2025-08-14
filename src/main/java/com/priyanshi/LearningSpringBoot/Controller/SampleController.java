package com.priyanshi.LearningSpringBoot.Controller;

import com.priyanshi.LearningSpringBoot.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping(value="/api")
public class SampleController {

    @InitBinder
    protected void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class, "firstName" , new FirstNamePropertyEditor());
    }
    @GetMapping(path="/fetchUser")
    public String getUserDetails(@RequestParam (name="firstName") String firstName,
                                  @RequestParam(name="lastName" ,required=false)String lastName,
                                 @RequestParam(name="age")int age){
        return "fetching and returning user details based on firstName=" +firstName +  "lastName ="+ lastName +"and age is "+age;
    }

    @GetMapping(path="/fetchUser/{firstName}")
    //@ResponseBody
    public String getDetails(@PathVariable (value="firstName") String firstName){
        return "fetching and returning user details based on the firstName =" +firstName;
    }

    @PostMapping(path="/saveUser")
    public String getUserDetails(@RequestBody User user){
        return "User Created "
 +user.username + ":" +user.email;     }

}

 class FirstNamePropertyEditor extends PropertyEditorSupport{
    @Override

     public void setAsText(String text) throws IllegalArgumentException{
        setValue(text.trim().toLowerCase());
    }
 }
