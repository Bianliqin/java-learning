package com.bianliqin.study.javadaily;

import java.util.Scanner;

/**
 * @ClassName TestFour7
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/7
 **/
public class TestFour7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean p = isP(next);
        System.out.println("回文数:" + p);
    }
    public static boolean isP(String str){
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
