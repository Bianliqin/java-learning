package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_8
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/29
 **/
public class Test3_8 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {

        int i = 10;
        int j = 20;
        j += i / 5;
        int k = j;

        System.out.println("i:" + i + "j:" + "k:" + k);
    }
}
