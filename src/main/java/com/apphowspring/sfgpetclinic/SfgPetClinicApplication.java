package com.apphowspring.sfgpetclinic;

import com.apphowspring.sfgpetclinic.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        // ask the context for an instance of MyController

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
