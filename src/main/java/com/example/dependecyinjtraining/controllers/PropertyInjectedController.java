package com.example.dependecyinjtraining.controllers;

import com.example.dependecyinjtraining.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
