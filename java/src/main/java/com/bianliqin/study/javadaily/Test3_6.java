package com.bianliqin.study.javadaily;

/**
 * @ClassName Test3_6
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/29
 **/
public class Test3_6 {
    public static void main(String[] args) {
        //在main方法中调用printNum方法
        printNum();
    }

    private static void printNum(){

        //printNum方法中，定义int变量a赋值为9，b也赋值为9
        int a = 9;
        int b = 9;

        //printNum方法中，定义int变量num赋值为++a.
        int num = ++a;
        //printNum方法中，定义boolean变量bo,使用三元运算符赋值，当num>=10,赋值为true，否则为false，打印bo的值
        boolean bo = (num>=10)? true : false;
        System.out.println("bo的值" + bo);

        //printNum方法中，定义int变量num2赋值为b++。
        int num2 = b++;
        //printNum方法中，定义boolean变量bo2，使用三元运算符赋值，当num2>=10，赋值为true，否则为false，打印bo2的值
        boolean bo2 = (num2 >= 10) ? true : false;
        System.out.println("bo2的值" + bo2);
    }
}
