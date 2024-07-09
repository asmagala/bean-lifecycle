package com.kodilla.beanlifecycle;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;

public class SingletonBean implements BeanNameAware {
    private String beanName;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Singleton been has been created");
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
        System.out.println("Name of the bean: " + name);
    }
}
