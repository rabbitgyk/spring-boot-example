package com.rabbit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 6:32 PM
 */

@Service
public class UseHelloService {

    @Autowired
    private HelloService helloService;

    public String sayHello(String word) {
        return helloService.sayHello(word);
    }

}
