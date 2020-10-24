package com.bianliqin.study.javadaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TraversalList
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/24
 **/
public class TraversalList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(
                Arrays.asList("tom","cat","Jane","jerry"));

        //方法1 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next());
        }
        System.out.println();

        //方法2 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        for(Iterator it2 = list.iterator();it2.hasNext();) {
            System.out.print(it2.next());
        }
        System.out.println();

        //方法3 增强型for循环遍历
        for(String value : list) {
            System.out.print(value);
        }
        System.out.println();

        //方法4 一般型for循环遍历
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //方法5 lambda遍历
        list.forEach(item -> System.out.print(item));
        System.out.println();

        //方法6 终极简洁版（方法引用）
        list.forEach(System.out::print);
    }
}


