package com.kodilla.beanlifecycle;

import jakarta.annotation.PostConstruct;

public class SingletonBean {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Singleton been has been created");
    }
}
