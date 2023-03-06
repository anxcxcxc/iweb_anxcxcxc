package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:48
 */
public class Divide extends Calculate{
    @Override
    public Integer getResult() {
        return getNumberA()/getNumberB();
    }
}
