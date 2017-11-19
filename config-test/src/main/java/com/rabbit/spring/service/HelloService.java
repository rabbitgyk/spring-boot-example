package com.rabbit.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 6:30 PM
 */

@Service
public class HelloService {

    public String sayHello(String word) {
        return "hello " + word + "!";
    }
}
