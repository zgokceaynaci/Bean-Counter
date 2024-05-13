package com.example.beancounter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeanCounter implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    @Override
    public void run(String[] args) {
        int beanCount = applicationContext.getBeanDefinitionCount();
        System.out.println("Total number of beans in the application: " + beanCount);
    }
}




