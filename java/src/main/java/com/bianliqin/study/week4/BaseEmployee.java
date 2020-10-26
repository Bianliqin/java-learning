package com.bianliqin.study.week4;

/**
 * @ClassName BaseEmployee
 * @Description ：基础的员工抽象类
 * @Author huachengyu
 * @Date 2020/10/26
 **/
public  abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     *@param
     * @return int
     */
    public abstract int getSalary();
}
