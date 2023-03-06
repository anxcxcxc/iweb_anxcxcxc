package com.iweb.test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Luohaojia
 * @data 2023/3/6 10:58
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        业务类的实现类需要切换的时候 不需要修改代码 只需要修改配置文件即可
        File propertyFile = new File("C:\\Users\\11322\\Desktop\\spring.txt");
//        java中有封装好的类 专门负责读取配置文件 效果和我们之前缩写的类似 但是简单
        Properties config = new Properties();
//        让配置类读取配置文件
        config.load(new FileInputStream(propertyFile));
        String className = (String)config.get("class");
        String methodName = (String)config.get("method");
//        根据反射实现方法调用
        Class productServiceClass = Class.forName(className);
        Constructor<ProductService> c = productServiceClass.getConstructor();
        Method m = productServiceClass.getMethod(methodName);
        ProductService ps = c.newInstance();
        m.invoke(ps);
;    }
}
