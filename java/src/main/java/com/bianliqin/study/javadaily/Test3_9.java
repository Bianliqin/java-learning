package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_9
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/29
 **/
public class Test3_9 {
    public static void main(String[] args) {

        printString();
    }

    public static void printString() {
        String str;
        int num = 69;
        str = (num % 2 == 0) ? "偶数" : "奇数";
        System.out.println("num:" + num + "是" + str);
    }
}
