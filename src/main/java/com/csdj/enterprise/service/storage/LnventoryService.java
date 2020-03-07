package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.Lnventory;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 成本调整业务逻辑层
 */
public interface LnventoryService {

    /**
     * 出现id
     */
    public List<Lnventory> findById(String lnventoryId);
    /**
     *
     * 查询所有成本调整
     */
    public PageUtil<Lnventory> findPage(int index, int pageSize, String lnventoryId, String lnventoryDate, String Date, String staffId);
    /**
     * 查询总数
     */
    public int Count(String lnventoryId,String lnventoryDate,String Date,String staffId);
    /**
     * 添加
     * @param lnve
     * @return
     */
    int add(Lnventory lnve);
    /**
     *
     * 查询所有物料拆装分页查询
     */
    public PageUtil<Lnventory>  DepotfindPage(int index, int pageSize, String lnventoryId, String lnventoryDate, String Date, String staffId,String lnventoryBei);
    /**
     * 查询总数
     */
    public int  DepotCount(String lnventoryId,String lnventoryDate,String Date,String staffId,String lnventoryBei);
}
