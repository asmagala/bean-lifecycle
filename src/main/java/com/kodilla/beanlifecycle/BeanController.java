package com.kodilla.beanlifecycle;


import org.springframework.context.ApplicationContext;
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
    @PostMapping("/prototype")
    public void createPrototypeBean() {
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
    }

    @PostMapping("singleton")
    public void createSingletonBean() {
        SingletonBean singletonBean = context.getBean(SingletonBean.class);
    }
}
