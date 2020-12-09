package com.liqinbian.sm.service;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.liqinbian.sm.entity.Clazz;
import com.liqinbian.sm.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName ClazzServiceTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/23
 **/
public class ClazzServiceTest{
    @Test
    public void getClazzByDepId(){
        List<Clazz>list = ServiceFactory.getClazzServiceInstance().getClazzByDepId(5);
        list.forEach(System.out::println);
    }
}
