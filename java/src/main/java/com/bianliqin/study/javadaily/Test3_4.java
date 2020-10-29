package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_4
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/28
 **/
public class Test3_4 {
    public static void main(String[] args) {
        //定义两个int类型变量a1和a2，分别赋值10，11，判断变量是否为偶数，拼接输出结果。
        int a1 = 10;
        int a2 = 11;
        boolean b1 = a1 % 2 == 0;
        boolean b2 = a2 % 2 == 0;
        System.out.println("10是偶数？" + b1);
        System.out.println("11是偶数？" + b2);
        //定义两个int类型变量a3和a4，分别赋值12，13，判断变量是否为奇数，拼接输出结果
        int a3 = 12;
        int a4 = 13;
        boolean b3 = a3 % 2 == 1;
        boolean b4 = a4 % 2 == 1;
        System.out.println("12是偶数？" + b3);
        System.out.println("13是偶数？" + b4);
    }
}



