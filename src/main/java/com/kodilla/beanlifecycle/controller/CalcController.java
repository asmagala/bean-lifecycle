package com.kodilla.beanlifecycle.controller;

import com.kodilla.beanlifecycle.domain.CalcDto;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @PostMapping(path = "add")
    public String addition(@RequestBody CalcDto data) {
        System.out.println("Dodawanie");
        System.out.println(data.getFirstNumber());
        System.out.println(data.getSecondNumber());
        String sFirstNumber = data.getFirstNumber().toString();
        String sSecondNumber = data.getSecondNumber().toString();
        BigDecimal result = data.getFirstNumber().add(data.getSecondNumber());
        return sFirstNumber + " + " + sSecondNumber + " = " + result.toString();
    }

    @PostMapping(path = "sub")
    public String subtraction(@RequestBody CalcDto data) {
        System.out.println("Odejmowanie");
        System.out.println(data.getFirstNumber());
        System.out.println(data.getSecondNumber());
        return (data.getFirstNumber().subtract(data.getSecondNumber())).toString();
    }

    @PostMapping(path = "multi")
    public String multiplication(@RequestBody CalcDto data) {
        System.out.println("Mnożenie");
        System.out.println(data.getFirstNumber());
        System.out.println(data.getSecondNumber());
        return (data.getFirstNumber().multiply(data.getSecondNumber())).toString();
    }

    @PostMapping(path = "div")
    public String division(@RequestBody CalcDto data) {
        System.out.println("Dzielenie");
        System.out.println(data.getFirstNumber());
        System.out.println(data.getSecondNumber());
        return (data.getFirstNumber().divide(data.getSecondNumber())).toString();
    }
}
