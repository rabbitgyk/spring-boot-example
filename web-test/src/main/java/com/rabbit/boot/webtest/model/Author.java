package com.rabbit.boot.webtest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: guoyankui
 * @DATE: 26/11/2017 10:34 PM
 */
@Component
@ConfigurationProperties(prefix = "author")
public class Author {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
