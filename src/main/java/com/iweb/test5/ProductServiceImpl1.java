package com.iweb.test5;

/**
 * @author Luohaojia
 * @data 2023/3/6 10:53
 */
public class ProductServiceImpl1 implements ProductService {
    @Override
    public void delete() {
        System.out.println("我删");
    }

    @Override
    public void run() {
        System.out.println("我跑");
    }
}
