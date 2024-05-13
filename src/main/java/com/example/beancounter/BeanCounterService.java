package com.example.beancounter;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanCounterService {

    private final ApplicationContext applicationContext;

    public BeanCounterService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public int countBeans() {
        return applicationContext.getBeanDefinitionCount();
    }
}

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanCounterService {

    private final ApplicationContext applicationContext;

    @Autowired
    public BeanCounterService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public int countBeans() {
        return applicationContext.getBeanDefinitionCount();
    }
}

 */

