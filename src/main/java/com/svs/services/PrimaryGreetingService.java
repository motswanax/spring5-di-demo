package com.svs.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author BAD
 * @version 15/02/19
 */
@Service
@Primary // use this bean if there is more than one
@Profile({"en", "default"}) // default will be active when there's no active profile or en is the active
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
