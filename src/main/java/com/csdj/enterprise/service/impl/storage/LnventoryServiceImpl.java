package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.LnventoryDao;
import com.csdj.enterprise.entity.storage.Lnventory;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.LnventoryService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 成本调整业务逻辑层的imp
 */
@Service

public class LnventoryServiceImpl implements LnventoryService {
    @Resource
    LnventoryDao dao;

    @Override
    public List<Lnventory> findById(String lnventoryId) {
        return dao.findById(lnventoryId);
    }

    @Override
    public PageUtil<Lnventory> findPage(int index, int pageSize, String lnventoryId, String lnventoryDate, String Date, String staffId) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Lnventory> page=new PageUtil<Lnventory>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (lnventoryId!=null) {
            map.put("lnventoryId", lnventoryId);
        }
        if (lnventoryDate!=null) {
            map.put("lnventoryDate", lnventoryDate);
        }
        if (Date!=null) {
            map.put("Date", Date);
        }
        if (staffId!=null) {
            map.put("staffId", staffId);
        }
        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(lnventoryId,lnventoryDate,Date,staffId);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String lnventoryId, String lnventoryDate, String Date, String staffId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("lnventoryId", lnventoryId);
        map.put("lnventoryDate", lnventoryDate);
        map.put("Date", Date);
        map.put("staffId", staffId);


        return dao.Count(map);
    }

    @Override
    public int add(Lnventory lnve) {
        return dao.add(lnve);
    }

    @Override
    public PageUtil<Lnventory> DepotfindPage(int index, int pageSize, String lnventoryId, String lnventoryDate, String Date, String staffId, String lnventoryBei) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Lnventory> page=new PageUtil<Lnventory>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (lnventoryId!=null) {
            map.put("lnventoryId", lnventoryId);
        }
        if (lnventoryDate!=null) {
            map.put("lnventoryDate", lnventoryDate);
        }
        if (Date!=null) {
            map.put("Date", Date);
        }

        if (staffId!=null) {
            map.put("staffId", staffId);
        }
        if (staffId!=null) {
            map.put("lnventoryBei", lnventoryBei);
        }
        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=DepotCount(lnventoryId,lnventoryDate,Date,staffId,lnventoryBei);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int DepotCount(String lnventoryId, String lnventoryDate, String Date, String staffId, String lnventoryBei) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("lnventoryId", lnventoryId);
        map.put("lnventoryDate", lnventoryDate);
        map.put("Date", Date);
        map.put("staffId", staffId);
        map.put("lnventoryBei", lnventoryBei);

        return dao.DepotCount(map);
    }
}
