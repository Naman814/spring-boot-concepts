package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Baseball - Run atleast 10KM daily!!";
    }
}
