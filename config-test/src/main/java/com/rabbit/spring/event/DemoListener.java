package com.rabbit.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: guoyankui
 * @DATE: 19/11/2017 10:14 PM
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我（bean-demo listener）接收到了（bean-demo publisher）发布的消息：" + msg);
    }
}
