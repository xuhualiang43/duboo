package com.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xuhualiang
 * @version V1.0
 * @description
 * @date 2018/8/28 17:41
 */
public class Provider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(classPathXmlApplicationContext.getDisplayName() + ":here");
        classPathXmlApplicationContext.start();
        System.out.println("服务已启动");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
