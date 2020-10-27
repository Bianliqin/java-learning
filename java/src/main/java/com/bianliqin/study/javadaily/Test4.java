package com.bianliqin.study.javadaily;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/27
 **/
public class Test4 {
    public static void main(String[] args) {
        //定义2个 byte类型变量，分别赋byte类型范围内最大值和最小值，并输出在控制台
        byte num1 = -128;
        byte num2 = 127;
        System.out.println(num1);
        System.out.println(num2);

        //定义2个 short类型变量，分别赋short类型范围内的值，并输出在控制台
        short num3 = -32768;
        short num4 = 32767;
        System.out.println(num3);
        System.out.println(num4);

        //定义2个 int类型变量，分别赋int类型范围内的值，并输出在控制台。
        int num5 = -2147483648;
        int num6 = 2147483647;
        System.out.println(num5);
        System.out.println(num6);

        //定义2个 long类型变量，分别赋超过int类型范围内的值，并输出在 控制台。
        long num7 = -2147483649L;
        long num8 = 2147483648L;
        System.out.println(num7);
        System.out.println(num8);
    }
}
