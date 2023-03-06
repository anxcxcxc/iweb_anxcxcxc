package com.iweb.test5;

/**
 * @author Luohaojia
 * @data 2023/3/6 10:55
 */
public class ProductServiceImpl2 implements ProductService {
    @Override
    public void run() {
        System.out.println("跑");
    }

    @Override
    public void delete() {
        System.out.println("我删");
    }
}
