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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
