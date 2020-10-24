package com.bianliqin.study.javadaily;

/**
 * @ClassName Circle
 * @Description Circle类继承Graph
 * @Author huachengyu
 * @Date 2020/10/24
 **/
public class Circle extends BaseGraph {
    private final double r;

    public Circle(double r){
        super();
        this.r = r;
    }

    @Override
    public double getCircumference(){
    return 2 * r * Math.PI;
    }
}
