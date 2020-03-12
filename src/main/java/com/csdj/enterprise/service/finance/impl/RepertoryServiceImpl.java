package com.csdj.enterprise.service.finance.impl;

import com.csdj.enterprise.dao.finance.RepertoryMapper;
import com.csdj.enterprise.entity.finance.Repertory;
import com.csdj.enterprise.service.finance.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: 实现类
 * @author: Yin jie
 * @create: 2020-02-17 19:04
 **/
@Service("repertoryServiceImpl")
public class RepertoryServiceImpl implements RepertoryService {
    @Autowired
    private RepertoryMapper repertoryMapper;

    @Override
    public List<Repertory> findByAll(String warehouse, String commodity, String remarks, Date date, int currPage, int pageSize) {
        return repertoryMapper.findByAll(warehouse,commodity,remarks, date,currPage,pageSize);
    }

    @Override
    public int findTypeNameCount(String warehouse) {
        return repertoryMapper.findTypeNameCount(warehouse);
    }

    @Override
    public int delById(int warehouseId) {
        return repertoryMapper.delById(warehouseId);
    }

    @Override
    public Repertory findById(int warehouseId) {
        return repertoryMapper.findById(warehouseId);
    }

    @Override
    public int update(Repertory repertory) {
        return repertoryMapper.update(repertory);
    }

    @Override
    public int add(Repertory repertory) {
        return repertoryMapper.add(repertory);
    }
}
