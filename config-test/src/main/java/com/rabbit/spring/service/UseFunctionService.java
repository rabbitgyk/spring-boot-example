package com.rabbit.spring.service;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 6:52 PM
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHi(String word){
        return functionService.sayHi(word);
    }
}
