package com.apphowspring.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello Friends = From PRIMARY bean";
    }
}

// set up Primary bean. It won't override qualifiers but will use this
// if qualifiers aren't there. Refactor MyController to use this
