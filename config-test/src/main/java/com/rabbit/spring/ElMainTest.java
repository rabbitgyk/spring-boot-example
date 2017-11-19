package com.rabbit.spring;

import com.rabbit.spring.config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 8:08 PM
 */
public class ElMainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig config = context.getBean(ElConfig.class);
        config.outputResource();
        context.close();
    }
}
