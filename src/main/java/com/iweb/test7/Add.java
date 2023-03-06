package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:47
 */
public class Add extends Calculate{
    @Override
    public Integer getResult() {
        return getNumberA()+getNumberB();
    }
}
