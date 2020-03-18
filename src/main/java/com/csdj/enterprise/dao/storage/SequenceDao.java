package com.csdj.enterprise.dao.storage;

import com.csdj.enterprise.entity.storage.Sequence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品序列号管理表
 * 莫宏峡
 */
@Mapper
public interface SequenceDao {
    /**
     * 出现id
     */
    public List<Sequence> findById(String sequenceId);
    /**
     *
     * 查询所有商品序列号管理表
     */
    public List<Sequence> findPage(Map map);
    /**
     * 查询总数
     */
    public int Count(Map map);
    /**
     * 添加
     * @param lnve
     * @return
     */
    int add(Sequence lnve);
}
