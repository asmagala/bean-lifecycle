package com.kodilla.beanlifecycle.event;

import com.kodilla.beanlifecycle.domain.CalcDto;
import org.springframework.context.ApplicationEvent;

public class CalcOperationEvent extends ApplicationEvent {
    private CalcDto calcDto;
    public CalcOperationEvent(Object source, CalcDto calcDto) {
        super(source);
        this.calcDto = calcDto;
    }

    public String getLog() {
        return calcDto.resultString(true);
    }
}
