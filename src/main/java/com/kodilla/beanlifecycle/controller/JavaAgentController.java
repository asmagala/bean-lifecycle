package com.kodilla.beanlifecycle.controller;

import com.kodilla.beanlifecycle.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javaagent")
public class JavaAgentController {

    @GetMapping("/{firstName}/{lastName}")
    public String createUser(@PathVariable String firstName, @PathVariable String lastName) {
        User user = new User(firstName, lastName);
        user.doSomething();
        return "User " + user.getFirstName() + " " + user.getLastName() + " has been created ;).";
    }

}
