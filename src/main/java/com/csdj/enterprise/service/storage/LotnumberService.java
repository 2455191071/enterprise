package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.Lotnumber;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;

/**
 * 莫宏峡
 * 批号库存管理表业务逻辑层
 */
public interface LotnumberService {
    /**
     * 出现id
     */
    public List<Lotnumber> findById(String lotnumberId);
    /**
     *
     * 查询所有成本调整
     */
    public PageUtil<Lotnumber> findPage(int index, int pageSize, String commodityId, String lotnumberId);
    /**
     * 查询总数
     */
    public int Count(String commodityId, String lotnumberId);
}
