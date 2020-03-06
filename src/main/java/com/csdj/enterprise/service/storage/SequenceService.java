package com.csdj.enterprise.service.storage;

import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.entity.storage.Sequence;

import java.util.List;

/**
 *
 * 莫宏峡
 * 商品序列号管理表Dao
 */
public interface SequenceService {
    /**
     * 出现id
     */
    public List<Sequence> findById(String sequenceId);
    /**
     *
     * 查询所有商品序列号
     */
    public PageUtil<Sequence> findPage(int index, int pageSize, String commodityId, String sequenceId, String memberId, String sequenceBei);
    /**
     * 查询总数
     */
    public int Count( String commodityId, String sequenceId, String memberId, String sequenceBei);
    /**
     * 添加
     * @param lnve
     * @return
     */
    int add(Sequence lnve);
}
