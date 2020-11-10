package com.bianliqin.study.javadaily;

import java.util.Scanner;

/**
 * @ClassName TestFour8
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/7
 **/
public class TestFour8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String next = scanner.next();
        int b = scanner.nextInt();
        String count = count(a, next, b);
        System.out.println(a + next + b + "#" + count);
    }

    public static String count(int a, String op, int b) {
        int r = 0;
        if ("+".equals(op)) {
            r = a + b;
        } else if ("-".equals(op)) {
            r = a - b;
        } else if ("*".equals(op)) {
            r = a * b;
        } else if ("/".equals(op)) {
            r = a / b;
        } else if ("%".equals(op)) {
            r = a % b;
        } else {
            return null;
        }

        return r + "";
    }
}
