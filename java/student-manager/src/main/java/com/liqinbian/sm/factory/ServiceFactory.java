package com.liqinbian.sm.factory;

import com.liqinbian.sm.service.AdminService;
import com.liqinbian.sm.service.DepartmentService;
import com.liqinbian.sm.service.impl.AdminServiceImpl;
import com.liqinbian.sm.service.impl.DepartmentServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author huachengyu
 * @Date 2020/11/17
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
    public static DepartmentService getDepartmentServiceInstance(){
        return new DepartmentServiceImpl();
    }
}
