package com.bianliqin.study.javadaily;

/**
 * @ClassName Test7
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/27
 **/
public class Test7 {
    public static void main(String[] args) {
        //定义两个整数变量a,b并赋值
        int a = 10;
        int b = 20;
        //控制台输出变量a,b的值
        System.out.println("互换前:");
        System.out.println(a);
        System.out.println(b);
        //定义一个第三方变量，不赋值
        int temp;
        //利用第三方变量，是a,b的值互换
        temp = a;
        a = b;
        b = temp;

        //控制台输出变量a,b的互换后的值
        System.out.println("互换后:");
        System.out.println(a);
        System.out.println(b);
    }
}


