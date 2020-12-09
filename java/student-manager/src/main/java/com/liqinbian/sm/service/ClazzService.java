package com.liqinbian.sm.service;

import com.liqinbian.sm.entity.Clazz;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ClazzService
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/23
 **/
public interface ClazzService {
    /**
     * @param department 班级
     * @return int
     */
    List<Clazz> getClazzByDepId(int department);

    /**
     * 新增班级
     *
     * @param clazz 班级实体
     * @return int
     */
    int addClazz(Clazz clazz);
    /**
     *
     * @param id
     * @return
     */
    int deleteClazz(Integer id);
    List<Clazz> selectAll();
}

