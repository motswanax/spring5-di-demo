package com.svs.controllers;

import com.svs.services.GreetingService;
import com.svs.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author BAD
 * @version 14/02/19
 */
@Controller
public class PropertyInjectedController {

    // Concrete class name example.
    @Autowired // <- inject this
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
