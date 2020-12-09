package com.liqinbian.sm.dao;

import com.liqinbian.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/18
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws SQLException 异常
     */
    List<Department> getAll() throws SQLException;

    /**
     * 删除
     * @param department
     * @return
     * @throws SQLException
     */
    int deleteDepartment(Department department,int id) throws SQLException;
    int delete(int depId) throws SQLException;

    /**
     *
     * @param department
     * @return int
     * @throws SQLException
     */
    int insertDepartment(Department department) throws SQLException;
}
