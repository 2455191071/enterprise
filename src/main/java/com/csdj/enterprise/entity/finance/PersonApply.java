package com.csdj.enterprise.entity.finance;

import lombok.Data;

import java.util.Date;

/**
 * @program: spring_erp
 * @description: pojo Class 按职员统计报销表
 * @author: Yin jie
 * @create: 2020-02-18 12:40
 **/
@Data
public class PersonApply {
    private int applyId;
    private String person;
    private int typeId;
    private double applyMoney;
    private Date theDateOf;
    private int applyDepartmentId;
    private int post;
    private String departmentName;
    private String costName;
}
