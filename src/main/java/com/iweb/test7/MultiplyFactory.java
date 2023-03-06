package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:40
 */
public class MultiplyFactory implements ICalculate {
    @Override
    public Calculate newCalculateInstance() {
        return new Multiply();
    }
}
