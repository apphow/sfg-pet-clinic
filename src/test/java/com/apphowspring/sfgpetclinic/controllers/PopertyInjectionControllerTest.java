package com.apphowspring.sfgpetclinic.controllers;

import com.apphowspring.sfgpetclinic.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PopertyInjectionControllerTest {

    // we need to the PropertyInjectedController
    PropertyInjectedController controller;

    // we need to configure this with a set up method, to set the
    // test conditions

    @BeforeEach
    void setUp() {

        //we're mimicking what the Spring Framework would be doing
        //by creating the object
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
        }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}
