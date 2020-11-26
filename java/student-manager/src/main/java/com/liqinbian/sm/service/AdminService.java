package com.liqinbian.sm.service;

import com.liqinbian.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description Admin业务逻辑接口
 * @Author huachengyu
 * @Date 2020/11/17
 **/
public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account:账号
     * @param password:密码
     * @return ResultEntity:返回结果
     */
    ResultEntity adminLogin(String account,String password);
}
