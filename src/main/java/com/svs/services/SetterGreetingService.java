package com.svs.services;

import org.springframework.stereotype.Service;

/**
 * @author BAD
 * @version 15/02/19
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}