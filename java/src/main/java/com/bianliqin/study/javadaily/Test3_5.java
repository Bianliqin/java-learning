package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_5
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/28
 **/
public class Test3_5 {
    public static void main(String[] args) {
        //定义一个int类型变量a，赋值为20.
        int a = 20;
        //定义boolean类型变量bo，判断++a 是否被3整除，并且a++ 是否被7整除，将结果赋值给bo
        boolean bo = ++a % 3 == 0 && a++ % 7 == 0;
        //输出a的值，bo的值
        System.out.println("bo的值:" + bo);
        System.out.println("a的值:" + a);
        System.out.println("------------");
        //定义一个int类型变量b，赋值为20.
        int b = 20;
        //定义boolean类型变量bo2,判断b++ 是否被3整除，并且++b  是否被7整除，将结果赋值给bo2
        boolean bo2 = b++ % 3 == 0 && ++b % 7 == 0;
        //输出b的值，bo2的值
        System.out.println("bo2的值:" + bo2);
        System.out.println("b的值:" + b);
    }
}




   