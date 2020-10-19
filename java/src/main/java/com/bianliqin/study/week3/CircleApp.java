package com.bianliqin.study.week3;

import java.awt.*;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args){
        Point point = new Point(10,20);
        Circle circle = new Circle(10,20,5);
        Cylinder cylinder = new Cylinder(10,10,5,6);
        point.print();
        circle.print();
        cylinder.print();
    }
}
