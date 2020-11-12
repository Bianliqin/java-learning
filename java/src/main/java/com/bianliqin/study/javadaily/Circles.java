package com.bianliqin.study.javadaily;

/**
 * @ClassName Circles
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/12
 **/
public class Circles {
    int r;
    public Circles(){
    }
    public Circles(int r){
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    public void showArea(){
        System.out.println("半径为:"+r+",面积为:"+(3.14*r*r));
    }
    public void showPerimeter(){
        System.out.println("半径为："+r+",面积为:"+(2*3.14*r));
    }
}
