package com.bianliqin.study.week7;

import java.util.HashMap;

/**
 * @ClassName Map
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/16
 **/
public class Map {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>(8);
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Lucy","JSP");

        map.put("Allen","JDBC");

        map.replace("Lucy","CoreJava");

        System.out.println(map);
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("");
}
