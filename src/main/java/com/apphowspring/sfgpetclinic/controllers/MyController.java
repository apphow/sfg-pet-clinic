package com.apphowspring.sfgpetclinic.controllers;

import com.apphowspring.sfgpetclinic.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    // set up to use PrimaryGreetingService
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
