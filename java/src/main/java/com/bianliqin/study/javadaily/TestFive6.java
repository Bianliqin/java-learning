package com.bianliqin.study.javadaily;

import java.util.Arrays;

/**
 * @ClassName TestFive6
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/12
 **/
public class TestFive6 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr) +"是否对称:"+sym(arr));
        int[] arr2 = {1,2,3,4,5,2,1};
        System.out.println(Arrays.toString(arr2) + "是否对称:" +sym(arr2));
    }
    public static boolean sym(int[] arr){
        /*
        start:数组头
        end：数组尾
         */
        for(int start = 0, end = arr.length-1; start <= end; start++, end--){
            //如果两端一旦有元素不等，就返回false
            if(arr[start]!= arr[end]){
                return false;
            }
        }
        return true;
    }
}
