package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Morder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：制令单
 */
@Mapper
public interface MorderMapper {
    /**
     * 制令单查询
     * @return
     */
    List<Morder> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 查询单个制令单
     * @return
     */
    Morder morderIdSelect(String morderId);

    /**
     * 根据morderId删除单个制令单
     * @return
     */
    int morderIdDelete(String morderId);

    /**
     *根据morderId修改单个制令单
     * @return
     */
    int findUpdate(Map map);
}
