package com.liqinbian.sm.service;

import com.liqinbian.sm.factory.ServiceFactory;
import com.liqinbian.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();


    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("bianliqin@qq.com","2034605883");
        System.out.println(resultEntity);
    }
}