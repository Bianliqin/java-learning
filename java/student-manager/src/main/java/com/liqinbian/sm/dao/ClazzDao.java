package com.liqinbian.sm.dao;

import com.liqinbian.sm.dao.impl.ClazzDaoImpl;
import com.liqinbian.sm.entity.Clazz;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzDao
 * @Description 班级dao接口
 * @Author huachengyu
 * @Date 2020/11/23
 **/
public interface ClazzDao {
    /**
     * 按照院系id查询班级
     *
     * @param departmentId 院系id
     * @return List<CClass> 院系班级集合
     * @throws SQLException 异常
     */
    List<Clazz> selectByDepartmentId(int departmentId) throws SQLException;

//    /**新增班级
//     *
//     * @param clazz 入参班级实体
//     * @return
//     * @throws SQLException 异常
//     */
//
//    int insertClazz(Clazz clazz) throws SQLException;
}

