package com.iweb.test1;

/**
 * @author Luohaojia
 * @data 2023/3/6 9:14
 */
public class Test {
    static {
        System.out.println("静态代码块被加载了");
    }
    //    反射 将java的类当作是对象
//    Class.class
//    构造方法的反射对象 方法的反射对象
//    ClassLoader 类加载器
    public static void main(String[] args) throws Exception{
//        获取类的反射对象
//        1.根据类的路径获取反射对象 会加载静态属性
        Class class1 = Class.forName("com.iweb.test1.Test");
//        2.根据对象获取反射对象 会加载静态属性
        Test t = new Test();
        Class class2 = t.getClass();
//        3.直接获取反射对象 不会加载静态属性
        Class class3 = Test.class;
        System.out.println(class1==class2);
        System.out.println(class2==class3);
    }
}
