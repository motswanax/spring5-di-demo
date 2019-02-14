package com.svs.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author BAD
 * @version 14/02/19
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!");

        return "bar";
    }
}
