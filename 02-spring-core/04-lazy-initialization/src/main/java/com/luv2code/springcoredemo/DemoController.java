package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;

    //constructor injection using Qualifier to resolve bean conflicts
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach coach){
        System.out.println("In constructor:"+getClass().getSimpleName());
        myCoach = coach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
