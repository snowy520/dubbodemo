package cn.xxx.module2;

import cn.xxx.module1.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 09/12/2015
 * @description
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
