package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.personnel.Clerk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 职员信息Dao
 */
@Mapper
public interface ClerkLnveDao {
    /**
     *
     * 查询所有职员信息
     */
    public List<Clerk> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
}
