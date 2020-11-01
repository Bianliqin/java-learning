package com.bianliqin.study.javadaily;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @ClassName TestCase1
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/1
 **/
public class TestCase1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(3);
        students.add(new Student("路飞" , 22 , 175));
        students.add(new Student("宏发", 30 , 167));
        students.add( new Student("白胡子" , 37,289));

        long count = students.stream().filter(s1 -> s1.getAge() < 45).count();
        System.out.println("年龄小于45岁的人数是：" + count);
    }
}
