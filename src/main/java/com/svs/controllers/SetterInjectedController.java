package com.svs.controllers;

import com.svs.services.GreetingService;

/**
 * @author BAD
 * @version 14/02/19
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}