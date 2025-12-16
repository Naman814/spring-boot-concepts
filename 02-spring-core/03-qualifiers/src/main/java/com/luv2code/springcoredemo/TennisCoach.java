package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Tennis-Run 5km daily!";
    }

}
