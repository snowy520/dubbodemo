package cn.xxx.test.domain;

import java.io.Serializable;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 05/19/2015
 * @description
 */
public class User implements Serializable {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
