package com.liqinbian.sm.dao;

import com.liqinbian.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description 管理员接口
 * @Author huachengyu
 * @Date 2020/11/16
 **/
public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account:账号入参
     * @return Admin:管理员信息
     * @throws SQLException:该方法会抛出SQL异常
     */
    Admin findAdminByAccount(String account) throws SQLException;
}
