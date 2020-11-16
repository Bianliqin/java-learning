package com.bianliqin.study.week7;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/16
 **/
@Data
@Builder

public class SetTest {
    public static void main(String[] args){
        System.out.println("TreeSet的例子");
        Student s1 = Student.builder().name("aaa").age(20).build();
        Student s2 = Student.builder().name("baa").age(19).build();
        Student s3 = Student.builder().name("cca").age(22).build();
        Set<Student> stuSet = new TreeSet<>();
        stuSet.add(s1);
        stuSet.add(s2);
        stuSet.add(s3);
        System.out.println(stuSet);

//        set.add("C");
//        set.add("A");
//        set.add("B");
        //System.out.println(set);
        //使用for循环遍历

        //使用iterator遍历

        //使用lambda遍历
//        System.out.println("HashSet例子");
//        Set<String> set = new HashSet<>();
//        set.add("C");
//        set.add("A");
//        set.add("B");
        //使用for循环遍历
//        System.out.println("使用for循环遍历");
//        Object[] array = set.toArray();
//        for(Object o : array) {
//            System.out.println(o.toString());
//        }
//        //使用iterator遍历
//        System.out.println("使用iterator遍历");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        //使用lambda遍历
//            System.out.println("使用lambda遍历");
//        set.forEach(s -> System.out.println(s));
//
//        //使用方法引用遍历
//        System.out.println("使用方法引用遍历");
//        set.forEach(System.out::println);

    }
}
