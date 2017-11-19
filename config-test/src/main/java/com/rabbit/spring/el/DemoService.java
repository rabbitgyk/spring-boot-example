package com.rabbit.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 7:26 PM
 */

@Service
public class DemoService {

    @Value("another attribute 郭衍奎")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
