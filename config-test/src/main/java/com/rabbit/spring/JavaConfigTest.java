package com.rabbit.spring;

import com.rabbit.spring.config.JavaConfig;
import com.rabbit.spring.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 6:59 PM
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.printf(useFunctionService.sayHi("guoyankui"));
    }
}
