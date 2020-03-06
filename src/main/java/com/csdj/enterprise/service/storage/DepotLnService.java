package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.Depot;
import com.csdj.enterprise.entity.storage.PageUtil;

import java.util.List;

/**
 * 莫宏峡
 * 仓库业务逻辑层
 */
public interface DepotLnService {
    /**
     * 出现id
     */
    public List<Depot> findById(String depotId);
    /**
     *
     * 查询所有会员信息
     */
    public PageUtil<Depot> findPage(int index, int pageSize, String depotId, String department, String remark);
    /**
     * 查询总数
     */
    public int Count( String depotId, String department, String remark);
}
