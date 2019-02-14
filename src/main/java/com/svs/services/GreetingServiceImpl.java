package com.svs.services;

import org.springframework.stereotype.Service;

/**
 * @author BAD
 * @version 14/02/19
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
