package com.bianliqin.study.week1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int Max = 5;

    public static void main(String[] args) {
        //创建一个10个元素的整型数组
        int[] a = new int[Max];
        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for (int i = 0; i < Max; i++) {
            //循环生成100以内随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int i = 0; i < Max; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        System.out.println("数组的和为:" + sum);
        System.out.println("最大值为：" + max + "最小值为:" + min);

        for (int i = 1; i < a.length; i++) {
            int t = a[i];
            int j = i - 1;
            while (t < a[j]) {
                a[j + 1] = a[j];
                j--;
                if (j < 0) {
                    break;
                }
            }
            a[j + 1] = t;
        }
        System.out.println("数组为：");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

