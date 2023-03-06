package com.iweb.test2;

import com.iweb.test1.Student;

import java.lang.reflect.Constructor;

/**
 * @author Luohaojia
 * @data 2023/3/6 9:27
 */
public class Test {
    //    java中所有反射相关的类 都在reflect包下
//    Constructor 构造方法的反射对象
    public static void main(String[] args) throws Exception{
//        传统创建对象的方式
        Student s1 = new Student();
//        反射方式
//        1.获取学生类的反射方式
        Class stuClass = Class.forName("com.iweb.test1.Student");
//        2.获取构造方法的构造器对象 默认获取的是午餐构造方法
        Constructor<Student> c = stuClass.getConstructor();
//        3.借助构造器完成学生对象的实例化
        Student s2 = c.newInstance();
        s2.setName("周博项目没写完,毕设也没写完");
        System.out.println(s2.getName());

//        如果向获取有参构造方法对应的构造器对象
//        需要提供你构造方法参数中每一个参数的反射对象
        Constructor<Student> c1 = stuClass.getConstructor(String.class,Integer.class);
//        调用有参构造器的时候 也需要提供对应的初始化参数
        Student s3 = c1.newInstance("周博是马浩奎的同学",23);
        System.out.println(s3);
    }
}
