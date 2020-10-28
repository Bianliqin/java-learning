package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_1
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/28
 **/
public class Test3_1 {
    public static void main(String[] args){

        //定义两个 byte类型变量
        byte b1 = 10;
        byte b2 = 20;
        //定义int 类型变量 b3
        int b3 = b1 + b2;
        System.out.println("byte类型b1和b2的和为:");
        System.out.println(b3);

        //定义两个 short类型变量
        short s1 = 1000;
        short s2 = 2000;
        //定义int 类型变量 b3
        int s3 = s1+s2;
        System.out.println("short类型s1和s2的和为:");
        System.out.println(s3);

        //定义char类型变量
        char ch1 = 'a';
        //定义int类型变量
        int i1 = 30;
        //定义int 类型变量 ch3
        int ch3 = ch1 - i1;
        System.out.println("char类型ch1和int类型i1的差为:");
        System.out.println(ch3);
    }
}