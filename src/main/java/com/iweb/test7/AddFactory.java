package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 13:38
 */
public class AddFactory implements ICalculate {
    @Override
    public Calculate newCalculateInstance() {
        return new Add();
    }
}
