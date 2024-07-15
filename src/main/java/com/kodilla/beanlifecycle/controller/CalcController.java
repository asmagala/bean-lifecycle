package com.kodilla.beanlifecycle.controller;

import com.kodilla.beanlifecycle.domain.CalcDto;
import com.kodilla.beanlifecycle.event.CalcOperationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calc")
public class CalcController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @GetMapping("/{op}/{firstNumber}/{secondNumber}")
    public String calculate(@PathVariable String op, @PathVariable double firstNumber, @PathVariable double secondNumber) {
        CalcDto calcDto = new CalcDto(op, firstNumber, secondNumber);
        String res = calcDto.resultString(false);

        publisher.publishEvent(new CalcOperationEvent(this, calcDto));
        return res;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
