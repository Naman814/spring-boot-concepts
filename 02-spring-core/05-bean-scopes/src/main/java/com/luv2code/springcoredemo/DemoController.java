package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //by default bean scope is singleton, means only one instance will be created.
    private Coach myCoach;
    private Coach anotherCoach;

    //constructor injection using Qualifier to resolve bean conflicts
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach mycoach,@Qualifier("tennisCoach") Coach anothercoach){
        System.out.println("In constructor:"+getClass().getSimpleName());
        myCoach = mycoach;
        anotherCoach = anothercoach;
    }

    @GetMapping("/check")
    public String checkScope(){
        return "checking scope: myCoach==anotherCoach :"+(myCoach==anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
