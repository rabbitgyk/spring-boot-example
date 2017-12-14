package com.rabbit.boot.webtest.common;

import java.io.Serializable;

/**
 * @Author: guoyankui
 * @DATE: 13/12/2017 1:28 PM
 */
public class ResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code = ReturnCodeEnum.SUCCESS.code;
    private String msg = ReturnCodeEnum.SUCCESS.msg;

    private T data;

    public ResultEntity(){}

    public ResultEntity(T data){
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


