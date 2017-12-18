package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.model.Book;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Author: guoyankui
 * @DATE: 17/12/2017 3:21 PM
 */
@RestController
@RequestMapping("/validation")
public class ValidationController {

    @PostMapping("/perfect/book")
    public ResultEntity<Book> perfect(@Valid Book book){
        book.setName("spring boot rabbit");
        book.setAuthor("郭衍奎12");
        book.setTotalPage(904);
        return new ResultEntity<>(book);
    }

    @GetMapping("/name")
    public ResultEntity<String> getName(int age){
        return new ResultEntity<>("nihao");
    }

}
