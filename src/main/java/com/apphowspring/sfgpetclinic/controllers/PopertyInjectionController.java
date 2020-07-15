package com.apphowspring.sfgpetclinic.controllers;

import com.apphowspring.sfgpetclinic.services.GreetingService;

public class PopertyInjectionController {

    public GreetingService greetingService;

    // return the greeting from the greeting srvice
    public String getGreeting() {
        return greetingService.sayGreeting();
    }


}
