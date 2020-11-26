package com.liqinbian.sm.service;

import com.liqinbian.sm.entity.Department;
import com.liqinbian.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName DepartmentServiceTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/18
 **/
public class DepartmentServiceTest {
    private final DepartmentService departmentService = ServiceFactory.getDepartmentServiceInstance();
    @Test
    public void selectAll(){
        List<Department> departmentList = departmentService.selectAll();
        departmentList.forEach(System.out::println);
    }
}
