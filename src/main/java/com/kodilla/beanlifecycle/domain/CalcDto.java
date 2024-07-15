package com.kodilla.beanlifecycle.domain;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CalcDto {
    private String op;
    private double firstNumber;
    private double secondNumber;

    public CalcDto(String op, double firstNumber, double secondNumber) {
        this.op = op;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getOp() {
        return op;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double sub() {
        return firstNumber - secondNumber;
    }

    public double mul() {
        return firstNumber * secondNumber;
    }

    public double div() {
        return firstNumber / secondNumber;
    }

    public String resultString(Boolean isLog) {
        String result = "";
        switch(op) {
            case "add":
                result = String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber) + " = " + String.valueOf(firstNumber + secondNumber);
                break;
            case "sub":
                result = String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber) + " = " + String.valueOf(firstNumber - secondNumber);
                break;
            case "mul":
                result = String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber) + " = " + String.valueOf(firstNumber * secondNumber);
                break;
            case "div":
                if (secondNumber != 0) {
                    result = String.valueOf(firstNumber) + " / " + String.valueOf(secondNumber) + " = " + String.valueOf(firstNumber / secondNumber);
                } else {
                    if (isLog) {
                        result = "Invalid operation: op = " + op + "; firstNumber = " + String.valueOf(firstNumber) + "; secondNumber = " + String.valueOf(secondNumber);
                    } else {
                        result = "Do not divide by 0!";
                    }
                }
                break;
            default:
                if (isLog) {
                    result = "Invalid operation: op = " + op + "; firstNumber = " + String.valueOf(firstNumber) + "; secondNumber = " + String.valueOf(secondNumber);
                } else {
                    result = "Invalid operation! <br>Allowed are: <br>add, sub, mul, div";
                }
        }
        return result;
    }
}
