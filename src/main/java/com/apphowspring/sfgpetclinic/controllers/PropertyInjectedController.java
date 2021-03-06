package com.apphowspring.sfgpetclinic.controllers;

import com.apphowspring.sfgpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    // return the greeting from the greeting srvice
    public String getGreeting() {
        return greetingService.sayGreeting();
    }


}
