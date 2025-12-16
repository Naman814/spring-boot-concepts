package com.luv2code.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Tennis-Run 5km daily!";
    }

    @PostConstruct
    public void doStartUpStuff(){
        System.out.println("Startup stuff done!");
    }

    @PreDestroy
    public void preDestroyMethods(){
        System.out.println("PreDestroy methods completed!");
    }

}
