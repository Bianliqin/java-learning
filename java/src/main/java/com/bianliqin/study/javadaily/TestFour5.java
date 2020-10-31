package com.bianliqin.study.javadaily;

/**
 * @ClassName TestFour5
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/30
 **/
public class TestFour5 {
    public static void main(String[] args){
        double random = Math.random()*100;
        System.out.println("随机数为:");
        System.out.println(random);
        String str = random+"";
        int index = str.indexOf(".");
        //System.out.println(index);
        String substring = str.substring(0,index + 3);
        System.out.println("转换为:");
        System.out.println(substring);
    }
}
