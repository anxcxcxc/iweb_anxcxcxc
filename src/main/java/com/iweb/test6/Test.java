package com.iweb.test6;

import java.util.Scanner;

/**
 * @author Luohaojia
 * @data 2023/3/6 11:35
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().view());
    }

    public Integer view(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要计算的数字1:");
        Integer num1 = Integer.parseInt(sc.nextLine());
        System.out.println("输入要计算的数字2:");
        Integer num2 = Integer.parseInt(sc.nextLine());
        System.out.println("输入你要计算的符号");
        String key = sc.nextLine();
        return calucate(num1,num2,key);
    }

    public Integer calucate(Integer num1,Integer num2,String key){
        switch (key){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            default:
                return null;
        }
    }
}
