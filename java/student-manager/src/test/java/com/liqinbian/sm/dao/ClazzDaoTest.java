package com.liqinbian.sm.dao;

import com.liqinbian.sm.entity.Clazz;
import com.liqinbian.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzDaoTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/23
 **/
public class ClazzDaoTest {
    private final ClazzDao clazzDao = DaoFactory.getClazzDaoInstance();
   @Test
   public void selectByDepartmentId(){
       List<Clazz> clazzList = null;
       try {
           clazzList = clazzDao.selectByDepartmentId(5);
       }catch (SQLException throwables){
           throwables.printStackTrace();
       }
       System.out.println(clazzList);
   }
}
