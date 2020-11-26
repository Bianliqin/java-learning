package com.liqinbian.sm.service;

import com.liqinbian.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/18
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();
    /**
     * 新增院系
     *
     * @param department 入参
     * @return int
     */
    int addDepartment(Department department);


    int delDepartment(Department department,Integer id);

}
