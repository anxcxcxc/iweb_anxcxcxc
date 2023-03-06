package com.iweb.test3;

import com.iweb.test1.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Luohaojia
 * @data 2023/3/6 9:45
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        通过全反射方式实现方法调用
//        1.获取类对象
        Class stuClass = Class.forName("com.iweb.test1.Student");
//        2.获取构造器对象
        Constructor<Student> c = stuClass.getConstructor(String.class,Integer.class);
//        3.借助构造器对象创建一个学生 王兵 22
        Student wb = c.newInstance("王兵",22);
//        4.根据类对象 获取方法fightRice的反射对象
//        需要根据方法名称 获取方法的反射对象 注意 如果方法有参数 需要提供参数类型所对应的反射对象
        Method m1 = stuClass.getMethod("fightRice");
//        5.调用方法 如果是一个成员方法 需要提供调用方法的对象
//        如果调用的方法有参数 应该在invoke执行的时候 提供其他参数的值
        m1.invoke(wb);
//        6.获取有参数的方法fightRice的反射对象
        Method m2 = stuClass.getMethod("fightRice",String.class);
//        7.调用有参的fightRice方法
        m2.invoke(wb,"周博");
    }
}
