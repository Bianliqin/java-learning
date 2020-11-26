package com.liqinbian.sm.dao;
import com.liqinbian.sm.entity.Admin;
import com.liqinbian.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import static org.junit.Assert.assertEquals;

public class AdminDaoTest {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("bianliqin@qq.com");
            assertEquals("卞丽琴",admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}