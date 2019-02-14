package com.svs.controllers;

import com.svs.services.GreetingService;
import com.svs.services.GreetingServiceImpl;

/**
 * @author BAD
 * @version 14/02/19
 */
public class PropertyInjectedController {

    // Concrete class name example.
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
