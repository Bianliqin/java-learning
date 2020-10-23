package com.bianliqin.study.javadaily;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/23
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        //对整型数组排序
        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        //对字符串数组排序
        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        //将一个随机字符串中的所有字符升序排列，并倒序打印
        String str = "asv76agfqwdfvasdfvjh";
        //如何进行升序排列:sort
        //必须是一个数组，才能用Arrays.sort方法
        //Stirng --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        //对字符数组进行升序排列
        Arrays.sort(chars);
        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}

