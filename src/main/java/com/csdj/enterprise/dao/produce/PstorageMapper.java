package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Pstorage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：生产入库
 */
@Mapper
public interface PstorageMapper {
    /**
     * 生产入库查询
     * @return
     */
    List<Pstorage> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 查询单个生产入库
     * @return
     */
    Pstorage pstorageIdSelect(String pstorageId);

    /**
     * 根据pstorageId删除单个生产入库
     * @return
     */
    int pstorageIdDelete(String pstorageId);

    /**
     *根据pstorageId修改单个生产入库
     * @return
     */
    int findUpdate(Map map);
}
