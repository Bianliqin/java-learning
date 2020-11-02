package com.bianliqin.study.javadaily;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @ClassName TestRegularExpression
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/2
 **/
public class TestRegularExpression {
    public static void main(String[] args) {
        String str1 = "abc";

        /**
         * 用正则表达式来判断
         * 1.compile(String regex)  将给定的正则表达式编译到模式中
         * 2.matcher(CharSequence input) 创建匹配给定输入与此模式的匹配器
         * 3.matches()  尝试将整个区域与模式匹配
         */
        //首先要编译正则规则形式
        Pattern p1 = compile("abc");
        //将正则进行匹配
        Matcher m1 = p1.matcher(str1);
        //进行判断
        boolean b1 = m1.matches();
        System.out.println(b1);
        System.out.println("***************");
        String str2 = "agx";

        //指定判断规则（中括号内字符顺序随便）
        Pattern p2 = compile("[abc][edgf][xzy]");
        //进行规则匹配
        Matcher m2 = p2.matcher(str2);
        //进行判断
        boolean b2 = m2.matches();
        System.out.println(b2);
        System.out.println("***************");
        String str3 = "qwe123SAD";
        String str4 = "qwe123456";
        check(str4);
    }

    public static void check(String str) {
        //判断输入的密码是否出现规定以外的字符
        if (!str.matches("[a-zA-Z0-9]{8,20}")) {
            System.out.println("密码不符合规范");
        }
        //记录出现几种字符
        int count = 0;

        //如果出现小写字符
        if (str.matches(".*[a-z].*")) {
            count++;
        }

        //如果出现大写字符
        if (str.matches(".*[A-Z].*")) {
            count++;
        }

        //如果出现数字
        if (str.matches(".*[0-9].*")) {
            count++;
        }

        //如果count<2
        if (count <= 2) {
            System.out.println("密码不符合规范");
        } else {
            System.out.println("密码正确");
        }
    }
}

