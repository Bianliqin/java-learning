package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_3
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/28
 **/
public class Test3_3 {
    public static void main(String[] args) {
        //定义char类型变量ch，赋值为'J'
        char ch = 'J';
        //将变量ch转换为小写'j'，并输出。
        ch = (char) (ch + 32);
        System.out.println(ch);
        //定义char类型变量ch2,赋值为'a'
        char ch2 = 'a';
        //将变量ch2转换为大写'A',并输出
        ch2 -= 32;
        System.out.println(ch2);
        //定义double类型变量d3，int类型变量i3
        double d3 = 3.5;
        int i3 = 100;

        //定义变量sum3,保存d3和i3的和，将sum3去除小数部分并输出。
        double sum3 = d3 + i3;
        System.out.println("sum3的的值:" + sum3);
        System.out.println("sum3的整数部分的值:" + (int) sum3);

        //定义double类型变量d4,int类型变量i4
        double d4 = 5.8;
        int i4 = 300;
        //定义int变量mul4,保存d4和i4乘积的整数部分，并输出
        int mul4 = (int) (d4 * i4);
        System.out.println("mul4的整数部分值:" + mul4);
    }
}
