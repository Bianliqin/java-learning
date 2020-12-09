package com.liqinbian.sm.service.impl;


import com.liqinbian.sm.dao.AdminDao;
import com.liqinbian.sm.entity.Admin;
import com.liqinbian.sm.factory.DaoFactory;
import com.liqinbian.sm.service.AdminService;
import com.liqinbian.sm.utils.ResultEntity;
import org.apache.commons.codec.digest.DigestUtils;

import java.sql.SQLException;

/**
 * @ClassName AdminServicelmpl
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/17
 **/

public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Override
    public ResultEntity adminLogin(String account,String password){
        ResultEntity resultEntity;
        Admin admin = null;
        try{
            //根据账号查找管理员信息，捕获SQL异常
            admin = adminDao.findAdminByAccount(account);
        }catch (SQLException e){
            System.err.println("根据账号查找管理员信息出现sql异常");
        }

        //根据账号查找到了记录
        if(admin !=null){
            //System.out.println(DigestUtils.md5Hex(password));
            //比较密码，此时需要将客户端传过来的密码进行MD5加密后才能比对
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())){
                resultEntity = ResultEntity.builder().code(0).message("登录成功").data(admin).build();
            }else {//账号存在，密码输入错误
                resultEntity = ResultEntity.builder().code(1).message("密码错误").build();
            }
        }else{//账号不存在
            resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
        }
        return resultEntity;
    }
}

