package com.bianliqin.study.javadaily;

import java.util.ArrayList;

/**
 * @ClassName TestFour6
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/7
 **/
public class TestFour6 {
    public static void main(String[] args){
        ArrayList<String>list = getArrayList();
        System.out.println("源字符串:");
        System.out.println(list);
        //删除集合中长度大于5的元素
        delStrsFromList01(list);
        System.out.println("删除后:");
        System.out.println(list);
    }

    //返回存储多个字符串的ArrayList集合
    private static ArrayList<String> getArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦，你干嘛呢");
        list.add("别跑啊");
        return list;
    }

    //删除list集合中所有长度>5的字符串
    private static void delStrsFromList01(ArrayList<String> list){
        //创建ArrayList集合对象
        ArrayList<String> newList = new ArrayList<String>();
        //遍历原集合对象
        for(int i = 0;i < list.size();i++){
            //获取当前元素
            String str = list.get(i);
            //如果str的长度大于等于5
            if(str.length()>5){
                //将str添加到新集合中
                newList.add(str);
            }
        }
        //遍历新集合
        for(Object str : newList){
            //因为新集合中的元素就是要删除的元素
            list.remove(str);
        }
    }
}
