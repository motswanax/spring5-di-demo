package com.svs.controllers;

import com.svs.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author BAD
 * @version 14/02/19
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    /**
     * Demo of multiple bean choices and use of primary bean.
     * @param greetingService the greeting service
     */
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
