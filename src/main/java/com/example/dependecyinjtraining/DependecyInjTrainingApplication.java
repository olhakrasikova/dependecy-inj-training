package com.example.dependecyinjtraining;

import com.example.dependecyinjtraining.controllers.MyController;
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
    }

}
