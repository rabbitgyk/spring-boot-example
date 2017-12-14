package com.rabbit.boot.webtest.service.impl;

import com.rabbit.boot.webtest.common.BizException;
import com.rabbit.boot.webtest.common.ReturnCodeEnum;
import com.rabbit.boot.webtest.model.Person;
import com.rabbit.boot.webtest.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: guoyankui
 * @DATE: 14/12/2017 11:52 PM
 */
@Service
public class HelloServiceImpl implements HelloService {

    private Person person = null;
    private static final String BLACK_NAME = "guoyankui";

    @Override
    public Person hello(String name) throws BizException {
        if(BLACK_NAME.equals(name)){
            throw new BizException(ReturnCodeEnum.BLACK_NAME_ERROR);
        }
        person = new Person();
        person.setName(name);
        person.setAddress("北京市海淀区上园村108号");
        person.setAge(109);
        person.setGender(true);
        return person;
    }

    @Override
    public void updateAddress(String address) throws BizException {
        person.setAddress(address);
    }

    @Override
    public Person get() throws BizException {
        if (person == null) {
            throw new BizException("为获取到用户对象");
        }
        return person;
    }


}
