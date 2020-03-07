package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Outsourcing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：外协单
 */
@Mapper
public interface OutsourcingMapper {
    /**
     * 外协单查询
     * @return
     */
    List<Outsourcing> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 查询单个外协单
     * @return
     */
    Outsourcing outsourcingIdSelect(String outsourcingId);

    /**
     * 根据outsourcingId删除单个外协单
     * @return
     */
    int outsourcingIdDelete(String outsourcingId);

    /**
     *根据outsourcingId修改单个外协单
     * @return
     */
    int findUpdate(Map map);
}
