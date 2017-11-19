package com.rabbit.spring;

import com.rabbit.spring.config.MainConfig;
import com.rabbit.spring.service.UseHelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 6:35 PM
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        UseHelloService useHelloService = context.getBean(UseHelloService.class);
        System.out.printf(useHelloService.sayHello("guoyankui"));
    }
}
