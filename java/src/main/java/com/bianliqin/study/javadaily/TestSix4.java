package com.bianliqin.study.javadaily;

import java.awt.*;

/**
 * @ClassName TestSix4
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/14
 **/
public class TestSix4 {
    public static void main(String[] args){
        int[] salary = {15000,3000};
        Manager m = new Manager("James","9527",salary);
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("==============");
        Coder c = new Coder();
        c.setName("Kobe");
        c.setId("0025");
        c.setSalary(10000);
        c.intro();
        c.showSalary();
        c.work();
    }
}
