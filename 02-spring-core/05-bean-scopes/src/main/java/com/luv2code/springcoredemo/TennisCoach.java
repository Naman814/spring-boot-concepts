package com.luv2code.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Prototype scope is specified which means new instances will be created every time.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Tennis-Run 5km daily!";
    }

}
