package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.model.Author;
import com.rabbit.boot.webtest.model.Person;
import com.rabbit.boot.webtest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guoyankui
 * @DATE: 26/11/2017 10:38 PM
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Author author;
    @Autowired
    private HelloService helloService;

    @GetMapping("/author")
    public ResultEntity<Author> getAuthor() {
        ResultEntity<Author> resultEntity = new ResultEntity<>();
        resultEntity.setData(author);
        return resultEntity;
    }

    @PostMapping("/person")
    public ResultEntity<Person> helloPerson(String name) throws Exception {
        ResultEntity<Person> resultEntity = new ResultEntity<>();
        Person person = helloService.hello(name);
        resultEntity.setData(person);
        return resultEntity;
    }

    @PutMapping("/address")
    public ResultEntity<?> updateAddress(String address) throws Exception{
        helloService.updateAddress(address);
        return new ResultEntity<>();
    }

    @GetMapping("/gg")
    public ResultEntity<Person> getPerson() throws Exception{
        Person person = helloService.get();
        return new ResultEntity<>(person);
    }

}
