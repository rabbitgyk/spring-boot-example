package com.rabbit.boot.webtest.common;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: guoyankui
 * @DATE: 13/12/2017 1:58 PM
 */
public class PageResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code = ReturnCodeEnum.SUCCESS.code;
    private String msg = ReturnCodeEnum.SUCCESS.msg;

    private int dataTotal;//数据总条数
    private int pageTotal;//总页数
    private int pageNumber;//页码，第几页
    private int pageSize;//页大小

    private List<T> data;

    public PageResultEntity(){}

    public PageResultEntity(List<T> data){
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

    public int getDataTotal() {
        return dataTotal;
    }

    public void setDataTotal(int dataTotal) {
        this.dataTotal = dataTotal;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
