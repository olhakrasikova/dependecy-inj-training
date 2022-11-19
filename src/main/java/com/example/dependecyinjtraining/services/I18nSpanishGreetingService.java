package com.example.dependecyinjtraining.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("I18nService")
@Profile({"ES", "default"})
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola mundo - Spanish Profile";
    }
}
