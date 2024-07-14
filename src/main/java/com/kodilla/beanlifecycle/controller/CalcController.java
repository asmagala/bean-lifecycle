package com.kodilla.beanlifecycle.controller;

import com.kodilla.beanlifecycle.domain.CalcDto;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @GetMapping("/{op}/{firstNumber}/{secondNumber}")
    public String calculate(@PathVariable String op, @PathVariable double firstNumber, @PathVariable double secondNumber) {
        return (new CalcDto(op, firstNumber, secondNumber)).resultString();
    }
}
