package cn.xxx.test;

import cn.xxx.test.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 05/19/2015
 * @description
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-core-2.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); //
        String hello = demoService.sayHello("tom"); // ִ
        System.out.println(hello); //

        //
        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        // System.out.println(demoService.hehe());
        System.in.read();
    }
}
