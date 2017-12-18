package com.rabbit.boot.webtest.service;

import com.rabbit.boot.webtest.model.Author;

import javax.validation.constraints.Size;

/**
 * @Author: guoyankui
 * @DATE: 19/12/2017 12:18 AM
 */
public interface ValidationService {
    Author makeAuthor(@Size(min = 3, max = 9, message = "name 9>= length >=3") String name);
}
