package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

// Component marks the class for dependency injection
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Do balling for atleast 15 minutes daily!";
    }
}
