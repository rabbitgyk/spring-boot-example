package com.rabbit.boot.webtest.service.impl;

import com.rabbit.boot.webtest.model.Author;
import com.rabbit.boot.webtest.service.ValidationService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: guoyankui
 * @DATE: 19/12/2017 12:21 AM
 */
@Service
@Validated
public class ValidationServiceImpl implements ValidationService {
    @Override
    public Author makeAuthor(String name) {
        Author author = new Author();
        author.setAge(12);
        author.setName(name);
        return author;
    }
}
