package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyankui
 * @DATE: 26/11/2017 10:38 PM
 */
@RestController
public class HelloController {

    @Autowired
    private Author author;

    @RequestMapping("/author")
    public Author getAuthor() {
        return author;
    }
}
