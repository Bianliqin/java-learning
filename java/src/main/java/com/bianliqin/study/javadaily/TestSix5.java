package com.bianliqin.study.javadaily;

/**
 * @ClassName TestSix5
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/15
 **/
public class TestSix5 {
    public static void main(String[] args){
        Teacher t = new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象");
        t.eat();
        t.jiangke();
        Stu stu = new Stu("韩同学",18,"java面向对象");
        stu.eat();
        stu.study();
    }
}
