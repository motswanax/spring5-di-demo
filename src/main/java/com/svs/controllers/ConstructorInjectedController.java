package com.svs.controllers;

import com.svs.services.GreetingService;

/**
 * @author BAD
 * @version 14/02/19
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}