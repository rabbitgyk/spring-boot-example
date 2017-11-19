package com.rabbit.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 10:12 PM
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
