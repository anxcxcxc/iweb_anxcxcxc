package com.iweb.test8;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:53
 */
public class SingleTon1 {
//    懒汉模式 在类加载的时候不会完成对象的初始化
//    只有当第一次被调用getInstance方法的时候 才会初始化对象(延迟加载)
//    默认情况下 无法保证线程安全
//    拥有当前类自己的私有静态引用
    private static SingleTon1 singleTon1;
//    私有的构造方法
    private SingleTon1(){

    }
//    提供一个公有的方法 用于外界获取该实例的引用
//    当前方法的同步对象是SingleTon1.class
//    既能实现延迟加载 也能保护线程安全
//    除了第一次获取是保护数据安全 后续获取都是在浪费资源
    public synchronized static SingleTon1 getInstance(){
        if (singleTon1==null){
            singleTon1 = new SingleTon1();
        }
        return singleTon1;
    }
}
