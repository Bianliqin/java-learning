package com.bianliqin.study.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName OverLoadTestApp
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/19
 **/
@Data
@Builder
@AllArgsConstructor
public class OverLoadTestApp {
    public static void main(String[] args) {
        int sum1=OverLoadTest.sum(4,5);
        System.out.println(sum1);
        int second=OverLoadTest.second(30,80);
        System.out.println(second);
    }
}
