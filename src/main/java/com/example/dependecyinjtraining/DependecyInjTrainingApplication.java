package com.example.dependecyinjtraining;

import com.example.dependecyinjtraining.controllers.ConstructorInjectedController;
import com.example.dependecyinjtraining.controllers.MyController;
import com.example.dependecyinjtraining.controllers.PropertyInjectedController;
import com.example.dependecyinjtraining.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependecyInjTrainingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependecyInjTrainingApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        String greeting = controller.sayHello();
        System.out.println(greeting);

        System.out.println("-------------------------- Property ------------------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------------------------- Setter ------------------");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------------------- Constructor ------------------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
