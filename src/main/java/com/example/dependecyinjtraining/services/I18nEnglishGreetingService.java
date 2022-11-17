package com.example.dependecyinjtraining.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("I18nService")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - English Profile";
    }
}
