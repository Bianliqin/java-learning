package com.liqinbian.sm.dao;

import com.liqinbian.sm.factory.DaoFactory;
import com.liqinbian.sm.vo.StudentVo;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName StudentDaoTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/12/3
 **/
public class StudentDaoTest {
    @Test
    public void selectAll() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void selectByDeId() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectByDepId(5);
        list.forEach(System.out::println);
    }

    @Test
    public void selectByClassId() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectByClassId(18);
        list.forEach(System.out::println);
    }

    @Test
    public void selectByKeywords() throws SQLException {
        List<StudentVo> list = DaoFactory.getStudentDaoInstance().selectBykeywords("田");
        list.forEach(System.out::println);
    }
}




