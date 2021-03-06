package com.liqinbian.sm.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultEntity
 * @Description 返回结果实体
 * @Author huachengyu
 * @Date 2020/11/17
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultEntity {
    private int code;
    private String message;
    private Object data;
}
