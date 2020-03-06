package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.Management;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;

/**
 * 莫宏峡
 * 库存流水管理业务逻辑层
 */
public interface ManagementService {
    /**
     * 出现id
     */
    public List<Management> findById(String managementId);
    /**
     *
     * 查询所有成本调整
     */
    public PageUtil<Management> findPage(int index, int pageSize, String commodityId, String managementDate, String Date, String wareId);
    /**
     * 查询总数
     */
    public int Count(String commodityId, String managementDate, String Date, String wareId);
}
