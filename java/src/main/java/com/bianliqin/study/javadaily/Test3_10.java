package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_10
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/29
 **/
public class Test3_10 {
    public static void main(String[] args){
        add();
        sub();
        mul();
        div();
        remain();
    }
public static void add(){
        int x = 100;
        int y = 200;

        //打印x和y的和到控制台
    System.out.println("x,y的和为:" + (x+y));
}

public static void sub(){
        int x = 100;
        int y = 200;

        //打印x和y的和到控制台
    System.out.println("x,y的差为:" + (x-y));
}

public static void mul(){
        int x = 100;
        int y = 200;

        //打印x和y的积到控制台
    System.out.println("x,y的积为:" +(x * y));
    }

    public static void div(){
        int x = 100;
        int y = 200;

        //打印x和y的商到控制台
        System.out.println("x,y的商为:" + (x/y));
    }

    private static void remain(){
        int x = 100;
        int y = 200;

        //打印x和y的余数到控制台
        System.out.println("x,y的余数为：" + (x % y));
    }
}
