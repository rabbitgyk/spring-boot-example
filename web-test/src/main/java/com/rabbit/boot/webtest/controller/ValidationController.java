package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.model.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyankui
 * @DATE: 17/12/2017 3:21 PM
 */
@RestController
@RequestMapping("/validation")
public class ValidationController {

    @PostMapping("/perfect/book")
    public ResultEntity<Book> perfect(Book book){
        book.setName("spring boot rabbit");
        book.setAuthor("郭衍奎12");
        book.setTotalPage(904);
        return new ResultEntity<>(book);
    }

}
