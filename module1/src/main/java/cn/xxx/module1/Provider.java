package cn.xxx.module1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 09/12/2015
 * @description
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
