package com.rabbit.boot.webtest.model;

import java.io.Serializable;

/**
 * @Author: guoyankui
 * @DATE: 14/12/2017 11:41 PM
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 576358007184693069L;
    private String name;
    private String address;
    private int age;
    /* true male */
    private boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
