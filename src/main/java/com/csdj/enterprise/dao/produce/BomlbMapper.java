package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Bomlb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：物料清单
 */
@Mapper
public interface BomlbMapper {
    /**
     * 物料清单查询
     * @return
     */
    List<Bomlb> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 新增物料清单
     * @return
     */
    int findInsert(Bomlb b);

    /**
     * 查询单个物料清单
     * @return
     */
    Bomlb bomIdSelect(String bomId);

    /**
     * 根据bomId删除单个物料清单
     * @return
     */
    int bomIdDelete(String bomId);

    /**
     *根据bomId修改单个物料清单
     * @return
     */
    int findUpdate(Map map);
}
