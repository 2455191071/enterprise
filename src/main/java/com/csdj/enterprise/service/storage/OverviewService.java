package com.csdj.enterprise.service.storage;


import com.csdj.enterprise.entity.storage.Overview;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;

/**
 * 莫宏峡
 * 库存总览业务逻辑层
 */
public interface OverviewService {
    /**
     * 出现id
     */
    public List<Overview> findById(String overviewId);
    /**
     *
     * 查询所有库存总览
     */
    public PageUtil<Overview> findPage(int index, int pageSize, String commodityId, String wareId);
    /**
     * 查询总数
     */
    public int Count( String commodityId, String wareId);

    /**
     * 添加
     */
    public  int add(Overview overview);
}
