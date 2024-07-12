package com.kodilla.beanlifecycle.controller;


import com.kodilla.beanlifecycle.LibraryManager;
import com.kodilla.beanlifecycle.PrototypeBean;
import com.kodilla.beanlifecycle.SingletonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BeanController {

    private final ApplicationContext context;

    public BeanController(ApplicationContext context) {
        this.context = context;
    }
    @GetMapping("/prototype")
    public String createPrototypeBean() {
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        return prototypeBean.toString();
    }

    @GetMapping("/singleton")
    public String createSingletonBean() {

        SingletonBean singletonBean = context.getBean(SingletonBean.class);
        return singletonBean.toString();
    }

    @GetMapping("/library")
    public String createLibraryBean() {
        LibraryManager libraryManager = context.getBean(LibraryManager.class);
        return libraryManager.toString();
    }
}
