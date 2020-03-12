package com.csdj.enterprise.service.finance.impl;

import com.csdj.enterprise.dao.finance.PersonApplyMapper;
import com.csdj.enterprise.entity.finance.ApplyDepartment;
import com.csdj.enterprise.entity.finance.CostType;
import com.csdj.enterprise.entity.finance.PersonApply;
import com.csdj.enterprise.service.finance.PersonApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: 实现类
 * @author: Yin jie
 * @create: 2020-02-18 12:50
 **/
@Service("personApplyService")
public class PersonApplyServiceImpl implements PersonApplyService {
    @Autowired
    PersonApplyMapper personApplyMapper;
    @Override
    public List<ApplyDepartment> findDepartment() {
        return personApplyMapper.findDepartment();
    }

    @Override
    public List<CostType> findCostType() {
        return personApplyMapper.findCostType();
    }

    @Override
    public List<PersonApply> findPost() {
        return personApplyMapper.findPost();
    }

    @Override
    public List<PersonApply> findpInfoName(Integer typeId, Integer applyDepartmentId, Date begindate, Date paydate, int currPage, int pageSize) {
        return personApplyMapper.findpInfoName(typeId,applyDepartmentId,begindate,paydate,currPage,pageSize);
    }

    @Override
    public int findTypeNameCount() {
        return personApplyMapper.findTypeNameCount();
    }

    @Override
    public int delById(int applyId) {
        return personApplyMapper.delById(applyId);
    }

    @Override
    public PersonApply findById(int applyId) {
        return personApplyMapper.findById(applyId);
    }

    @Override
    public int update(PersonApply personApply) {
        return personApplyMapper.update(personApply);
    }

    @Override
    public int add(PersonApply personApply) {
        return personApplyMapper.add(personApply);
    }
}
