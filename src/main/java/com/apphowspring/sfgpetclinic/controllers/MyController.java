package com.apphowspring.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("HI there");

        return "Hi everyone";
    }
}
