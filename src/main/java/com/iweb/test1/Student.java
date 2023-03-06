package com.iweb.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Luohaojia
 * @data 2023/3/6 9:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer age;
    public void fightRice(){
        System.out.println(name+"问:中午吃什么");
    }
    public void fightRice(String who){
        System.out.println(name+"问"+who+"中午吃什么");
    }
}
