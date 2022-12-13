package com.example.dependecyinjtraining.services;

import org.springframework.stereotype.Service;


public class SetterInjectedGreetingService implements GreetingService{


    public String sayGreeting() {
        return "Hello World -- Setter";
    }

}
