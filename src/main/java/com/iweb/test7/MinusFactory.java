package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:39
 */
public class MinusFactory implements ICalculate {
    @Override
    public Calculate newCalculateInstance() {
        return new Minus();
    }
}
