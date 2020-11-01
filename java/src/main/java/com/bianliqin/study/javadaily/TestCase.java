package com.bianliqin.study.javadaily;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName TestCase
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/1
 **/
public class TestCase {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(3);
        students.add(new Student("路飞" , 22 , 175));
        students.add(new Student("宏发", 30 , 167));
        students.add( new Student("白胡子" , 37,289));

        List<Student> list = students.stream()
                .filter(stu -> stu.getStature() < 180)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

