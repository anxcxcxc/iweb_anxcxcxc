package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:45
 */
public abstract class Calculate {
    private Integer numberA;
    private Integer numberB;
    public abstract Integer getResult();

    public void setNumberA(Integer numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(Integer numberB) {
        this.numberB = numberB;
    }

    public Integer getNumberA() {
        return numberA;
    }

    public Integer getNumberB() {
        return numberB;
    }
}
