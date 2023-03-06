package com.iweb.test7;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:50
 */
public class CalculateFactory {
    public static Calculate newCalculateInstance(String key){
        Calculate calculate = null;
        switch (key){
            case "+":
                calculate = new Add();
                break;
            case "-":
                calculate = new Minus();
                break;
            case "*":
                calculate = new Multiply();
                break;
            case "/":
                calculate = new Divide();
                break;
        }
        return calculate;
    }
}
