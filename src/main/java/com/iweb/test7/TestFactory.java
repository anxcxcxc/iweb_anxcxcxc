package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:42
 */
public class TestFactory {
    public static void main(String[] args) {
        ICalculate factory =  new AddFactory();
        Calculate c = factory.newCalculateInstance();

    }
}
