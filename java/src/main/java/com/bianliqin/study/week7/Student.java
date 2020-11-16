package com.bianliqin.study.week7;

import com.bianliqin.study.javadaily.Stu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/16
 **/
@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
