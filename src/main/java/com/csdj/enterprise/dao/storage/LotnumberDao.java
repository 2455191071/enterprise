package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Lotnumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 批号库存管理表表Dao
 */
@Mapper
public interface LotnumberDao {
    /**
     * 出现id
     */
    public List<Lotnumber> findById(String lotnumberId);
    /**
     *
     * 查询所有成本调整
     */
    public List< Lotnumber> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);

}
