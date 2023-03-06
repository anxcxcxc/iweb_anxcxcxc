package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:41
 */
public class DivideFactory implements ICalculate {
    @Override
    public Calculate newCalculateInstance() {
        return new Divide();
    }
}
