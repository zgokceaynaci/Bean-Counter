package com.example.beancounter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanCounterController {
    private final BeanCounterService beanCounterService;

    public BeanCounterController(BeanCounterService beanCounterService) {
        this.beanCounterService = beanCounterService;
    }

    @GetMapping("/bean-count")
    public int getBeanCount() {
        return beanCounterService.countBeans();
    }
}

