package com.rabbit.spring;

import com.rabbit.spring.config.EventConfig;
import com.rabbit.spring.event.DemoPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 10:23 PM
 */
public class EventMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("hello guoyankui");
        context.close();
    }
}
