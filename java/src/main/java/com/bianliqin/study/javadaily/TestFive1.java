package com.bianliqin.study.javadaily;

/**
 * @ClassName TestFive1
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/11
 **/
public class TestFive1 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,66,70,80,99};
        printNum(arr);
    }
    public static void printNum(int[] arr){
        System.out.println("您的大乐透号码为:");
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
