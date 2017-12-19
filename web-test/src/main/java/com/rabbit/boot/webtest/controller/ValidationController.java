package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.model.Author;
import com.rabbit.boot.webtest.model.Book;
import com.rabbit.boot.webtest.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: guoyankui
 * @DATE: 17/12/2017 3:21 PM
 */
@RestController
@RequestMapping("/validation")
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @PostMapping("/perfect/book")
    public ResultEntity<Book> perfect(@Valid Book book){
        book.setName("spring boot rabbit");
        book.setAuthor("郭衍奎12");
        book.setTotalPage(904);
        return new ResultEntity<>(book);
    }

    @GetMapping("/name")
    public ResultEntity<String> getName(@RequestParam(required = false) String age){
        return new ResultEntity<>("@RequestParam(required = false)控制是否必填");
    }

    @GetMapping("/author")
    public ResultEntity<Author> getAuthor(String name){

        Author author = validationService.makeAuthor(name);
        return new ResultEntity<>(author);
    }

}
