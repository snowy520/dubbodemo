package cn.xxx.module1.service;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 09/12/2015
 * @description
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
