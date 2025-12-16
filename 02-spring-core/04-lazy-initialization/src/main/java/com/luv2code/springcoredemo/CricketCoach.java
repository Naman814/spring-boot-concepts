package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Component marks the class for dependency injection
@Component
// Lazy annotation for not initializing bean when app starts, it will be only initialized when required. If want to do for all classes, update in app.properties.
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor:"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Cricket -Do balling for atleast 15 minutes daily!";
    }
}
