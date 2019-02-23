package com.svs.services;

import org.springframework.stereotype.Component;

/**
 * @author BAD
 * @version 15/02/19
 */
@Component // <- can use Controller, Service, Component or Repository to bring it in as a bean.
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}