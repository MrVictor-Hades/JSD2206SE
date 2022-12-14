package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的序列化与反序列化
 *
 * JAVA BEAN定义规范   bean:豆子  java:爪洼
 * 1:属性私有化
 * 2:为属性提供公开的GET SET方法
 * 3:定义无参构造器
 * 4:实现序列化接口
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    private String[] otherInfo;

    public Person(){}
    /*
        alt+insert
        1:Constructor 全选里面的属性生成全参构造器
        2:Getter and Setter 全选里面的属性生成所有属性的get set方法
     */
    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
