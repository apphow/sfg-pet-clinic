package com.apphowspring.sfgpetclinic.controllers;

import com.apphowspring.sfgpetclinic.services.GreetingService;

public class SetterInjectedController {


    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
