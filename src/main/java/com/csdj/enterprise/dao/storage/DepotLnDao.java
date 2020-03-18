package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Depot;
import com.csdj.enterprise.entity.storage.Lnventory;import com.csdj.enterprise.entity.storage.Lnventory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 仓库Dao层
 */
@Mapper
public interface DepotLnDao {
    /**
     * 出现id
     */
    public List<Depot> findById(String depotId);
    /**
     *
     * 查询所有仓库
     */
    public List<Depot> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);

}
