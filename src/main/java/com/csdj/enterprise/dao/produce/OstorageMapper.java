package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Ostorage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：外协入库
 */
@Mapper
public interface OstorageMapper {
    /**
     * 外协入库查询
     * @return
     */
    List<Ostorage> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 查询单个外协入库
     * @return
     */
    Ostorage ostorageIdSelect(String ostorageId);

    /**
     * 根据ostorageId删除单个外协入库
     * @return
     */
    int ostorageIdDelete(String ostorageId);

    /**
     *根据ostorageId修改单个外协入库
     * @return
     */
    int findUpdate(Map map);
}
