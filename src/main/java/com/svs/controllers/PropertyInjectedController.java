package com.svs.controllers;

import com.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author BAD
 * @version 14/02/19
 */
@Controller
public class PropertyInjectedController {

    // Concrete class name example.
    @Autowired // <- inject this
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
