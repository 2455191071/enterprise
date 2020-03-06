package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Lnventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 *成本调整Dao
 *
 */
@Mapper

public interface LnventoryDao {
    /**
     * 出现id
     */
    public List<Lnventory> findById(String lnventoryId);
    /**
     *
     * 查询所有成本调整
     */
    public List<Lnventory> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
    /**
     * 添加
     * @param lnve
     * @return
     */
    int add(Lnventory lnve);

    /**
     * 物料拆装分页查询
     * @param map
     * @return
     */
    public List<Lnventory> DepotfindPage(Map map);
    /**
     * 查询总数
     */
    public int DepotCount(Map map);
}
