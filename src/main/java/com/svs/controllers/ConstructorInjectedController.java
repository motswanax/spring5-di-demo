package com.svs.controllers;

import com.svs.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author BAD
 * @version 14/02/19
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    /**
     * Demo of the use of a qualifier to overcome the scenarion of multiple available beans at runtime.
     * @param greetingService - the bean to use from greeting services.
     */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}