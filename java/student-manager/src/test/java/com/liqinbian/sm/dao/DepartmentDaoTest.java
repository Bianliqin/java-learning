package com.liqinbian.sm.dao;

import com.liqinbian.sm.entity.Department;
import com.liqinbian.sm.factory.DaoFactory;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName DepartmentDaoTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/18
 **/
public class DepartmentDaoTest {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Test
    public void getAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assert departmentList != null;
        departmentList.forEach(System.out::println);
    }
@Test
public void insert(){
    int n = 0;
    Department department = Department.builder()
            .departmentName("测试院系")
            .logo("2.jpg")
            .build();
    try {
        n = departmentDao.insertDepartment(department);
    }catch (SQLException e){
        e.printStackTrace();
    }
    assertEquals(1,n);
}
}
