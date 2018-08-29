package com.dubbo.consumer;

import com.dubbo.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xuhualiang
 * @version V1.0
 * @description
 * @date 2018/8/28 17:36
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        // 启动消费者
        classPathXmlApplicationContext.start();
        System.out.println("消费者启动");
        UserService userService = classPathXmlApplicationContext.getBean(UserService.class);
        System.out.println("消费者");
        System.out.println(userService.getUserInfo(1));
    }
}