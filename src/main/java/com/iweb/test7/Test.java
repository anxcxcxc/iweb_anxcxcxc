package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:53
 */
public class Test {
    public static void main(String[] args) {
//        从供唱获取一个计算类的子类对象
        Calculate c = CalculateFactory.newCalculateInstance("+");
        c.setNumberA(5);
        c.setNumberB(3);
        System.out.println(c.getResult());
    }
}
