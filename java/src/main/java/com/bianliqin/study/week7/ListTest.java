package com.bianliqin.study.week7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //创建一个List接口的实现类的对象，泛型为String
        ArrayList<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");
        //随机取出list中的某个元素
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("用for循环遍历list");
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用Lambda的方法应用来遍历list，终极简单版本");
        list.forEach(System.out::println);
    }
}
