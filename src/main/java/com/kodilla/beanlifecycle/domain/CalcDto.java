package com.kodilla.beanlifecycle.domain;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CalcDto {
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;

    public CalcDto(BigDecimal firstNumber, BigDecimal secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public BigDecimal getFirstNumber() {
        return firstNumber;
    }

    public BigDecimal getSecondNumber() {
        return secondNumber;
    }
}
