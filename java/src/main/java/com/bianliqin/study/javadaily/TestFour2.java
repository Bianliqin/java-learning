package com.bianliqin.study.javadaily;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * @ClassName Test4_2
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/29
 **/
public class Test4_2 {
    public static void main(String[] args) {
        //1.键盘输入一个qq号码字符串
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        //2.调用checkQQ（String qq）方法内实现验证
        boolean isOk = checkQQ(qq);
        //3.打印验证的结果
        System.out.println("这个QQ号码是否正确:" + isOk);
    }

    /**
     *定义方法:checkQQ (String qq)方法内实现验证
     *指定方法的名称：checkQQ
     *指定方法的参数：String qq
     *指定方法的返回值：boolean
     */
    public static boolean checkQQ(String qq) {
        //1.验证字符串的长度5-12位之间；
        if (qq.length() < 5 || qq.length() > 12) {
            //说明qq号码的长度不正确
            return false;
        }
        //2.验证首位字符不能是字符0；只能是字符'1'--'9'
        if (qq.charAt(0) == '0') {
            return false;
        }
        //3.验证字符串中的每个字符都必须是数字字符'0'-'9'之间的字符
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            //判断字符是否在数字字符'0'-'9'之间的字符
            if (ch < '0' || ch > '9') {
                return false;//说明qq号码中含有非数字字符
            }
        }
        //4.上述验证都通过了，说明qq号码是正确的
        return true;
    }
}