package com.iweb.test8;

/**
 * @author Luohaojia
 * @data 2023/3/6 14:04
 */
public class HungryTon {
//    在类加载的时候就完成对象的实例化
//    定义静态属性 并且在类加载的时候 就完成对象的实例化
//    线程安全 不支持延迟加载 在使用者获取实例的时候 实例很早就创建好了
    private static HungryTon hungryTon = new HungryTon();
    private HungryTon(){

    }

    public static HungryTon getInstance(){
        return hungryTon;
    }
}
