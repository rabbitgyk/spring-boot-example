package com.rabbit.boot.webtest.service;

import com.rabbit.boot.webtest.common.BizException;
import com.rabbit.boot.webtest.model.Person;

/**
 * @Author: guoyankui
 * @DATE: 14/12/2017 11:38 PM
 */
public interface HelloService {

    Person hello(String name) throws BizException;

    void updateAddress(String address) throws BizException;

    Person get() throws BizException;
}
