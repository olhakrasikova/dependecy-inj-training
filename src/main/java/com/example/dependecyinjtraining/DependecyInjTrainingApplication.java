package com.example.dependecyinjtraining;

import com.example.dependecyinjtraining.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependecyInjTrainingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependecyInjTrainingApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        System.out.println("-------------------------- Primary Bean ------------------");

        System.out.println(controller.sayHello());

        System.out.println("-------------------------- Property ------------------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------------------------- Setter ------------------");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------------------- Constructor ------------------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("-------------------------- Profiles ------------------");

        I18nController i18nController = (I18nController) context.getBean("i18nController");

        System.out.println(i18nController.sayHello());
    }

}
