package com.bianliqin.study.javadaily;

/**
 * @ClassName TestFour9
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/7
 **/
public class TestFour9 {
    public static void main(String[] args) {
        String s = "qweRY123";
        System.out.println(s + "密码是否合法:" + isV(s));
    }

    public static boolean isV(String pwd) {
        if (pwd.length() < 8) {
            return false;
        }

        int countA = 0;
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            //2个大写字符
            if (ch >= 'A' && ch <= 'Z') {
                countA++;
            }

            //字母数字
            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'Z')) {
                return false;
            }
        }
        if (countA < 2) {
            return false;
        }
        return true;
    }
}
