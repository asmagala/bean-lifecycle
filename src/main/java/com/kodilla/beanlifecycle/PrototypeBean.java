package com.kodilla.beanlifecycle;

import jakarta.annotation.PostConstruct;


public class PrototypeBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Prototype Bean has been created");
    }
}
