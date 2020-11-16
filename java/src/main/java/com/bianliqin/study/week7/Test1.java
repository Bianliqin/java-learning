package com.bianliqin.study.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Map
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/16
 **/
public class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Lucy", "JSP");

        map.put("Allen", "JDBC");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            if ("Lucy".equals(key)) {
                entry.setValue("JDBC");
            }
        }
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("老师:" + entry.getKey() + "课程:" + entry.getValue());
        }
        Set<String> set = map.keySet();
    }
}
