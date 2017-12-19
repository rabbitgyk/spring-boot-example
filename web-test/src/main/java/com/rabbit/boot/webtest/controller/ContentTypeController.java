package com.rabbit.boot.webtest.controller;

import com.rabbit.boot.webtest.common.ResultEntity;
import com.rabbit.boot.webtest.model.Person;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guoyankui
 * @DATE: 19/12/2017 10:32 PM
 */
@RestController
@RequestMapping("/content")
public class ContentTypeController {

    /**
     * "@RequestBody" 请求参数为json
     * @param person
     * @return
     */
    @PostMapping(value = "/person")
    public ResultEntity<Person> getPerson(@RequestBody Person person){
        person.setGender(true);
        person.setName("guoyankui");
        person.setAge(22);
        return new ResultEntity<>(person);
    }
}
