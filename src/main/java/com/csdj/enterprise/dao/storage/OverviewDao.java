package com.csdj.enterprise.dao.storage;



import com.csdj.enterprise.entity.storage.Overview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 库存总览表Dao
 */
@Mapper
public interface OverviewDao {
    /**
     * 出现id
     */
    public List<Overview> findById(String overviewId);
    /**
     *
     * 查询所有库存总览
     */
    public List<Overview> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
    /**
     * 添加
     */
    public  int add(Overview overview);
}
