package com.iweb.test4;

import com.iweb.test1.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Luohaojia
 * @data 2023/3/6 9:54
 */
public class Test {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\11322\\Desktop\\spring.txt");
        String className = null;
        String methodName = null;
        try (FileReader fr = new FileReader(f);
             BufferedReader br = new BufferedReader(fr)){
            String line = "";
            while ((line=br.readLine())!=null){
                String[] parts = line.split("=");
                String key = parts[0].toString();
                String value = parts[1].toString();
                if (key.equals("class")){
                    className = value;
                }else if (key.equals("method")){
                    methodName = value;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Class stuClass = Class.forName("com.iweb.test1."+className);
        Constructor<Student> c = stuClass.getConstructor(String.class,Integer.class);
        Student hj = c.newInstance("hj",22);
        Method m1 = stuClass.getMethod(methodName);
        m1.invoke(hj);
        Method m2 = stuClass.getMethod(methodName,String.class);
        m2.invoke(hj,"you");
//        反射提供了一种新的思想 基于配置文件的编程
    }
}
