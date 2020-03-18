package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Management;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 库存流水管理表Dao
 */
@Mapper
public interface ManagementDao {

    /**
     * 出现id
     */
    public List<Management> findById(String managementId);
    /**
     *
     * 查询所有库存流水管理
     */
    public List<Management> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
}
