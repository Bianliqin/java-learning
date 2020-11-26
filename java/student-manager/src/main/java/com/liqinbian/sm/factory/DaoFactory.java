package com.liqinbian.sm.factory;

import com.liqinbian.sm.dao.AdminDao;
import com.liqinbian.sm.dao.ClazzDao;
import com.liqinbian.sm.dao.DepartmentDao;
import com.liqinbian.sm.dao.impl.AdminDaoImpl;
import com.liqinbian.sm.dao.impl.ClazzDaoImpl;
import com.liqinbian.sm.dao.impl.DepartmentDaoImpl;
import com.liqinbian.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/18
 **/
public class DaoFactory {
    /**
     * 获取AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
            }
    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }
    /**
     * 获得ClazzDao实例
     *
     * @return ClazzDao实例
     */
    public static ClazzDao getClazzDaoInstance(){
        return new ClazzDaoImpl();
    }
}
