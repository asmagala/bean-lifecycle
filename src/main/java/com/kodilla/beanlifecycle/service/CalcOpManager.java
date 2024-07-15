package com.kodilla.beanlifecycle.service;

import com.kodilla.beanlifecycle.event.CalcOperationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalcOpManager implements ApplicationListener<CalcOperationEvent> {
    @Override
    public void onApplicationEvent(CalcOperationEvent event) {
        System.out.println("Activated operation: " + event.getLog());
    }
}
