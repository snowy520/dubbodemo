package cn.xxx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 05/19/2015
 * @description
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        context.start();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
