package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    //Field injection - No longer recommended as it makes it harder for unit tests. No need for constructor or setter injection while using field.
    @Autowired
    private Coach myCoach;

    /*
    Setter Injection
    @Autowired
    void setMyCoach(Coach coach){
        myCoach = coach;
    }
    */


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
