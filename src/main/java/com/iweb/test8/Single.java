package com.iweb.test8;

/**
 * @author Luohaojia
 * @data 2023/3/6 14:15
 */
public class Single {
    private static Single single;
    private Single(){}
    private Single getInstance(){
        if(null==single){
            synchronized (Single.class){
                if (null==single){
                    single = new Single();
                }
            }
        }
        return single;
    }
}
