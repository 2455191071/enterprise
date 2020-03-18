package com.csdj.enterprise.dao.produce;

import com.csdj.enterprise.entity.produce.Plan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Dao层：生产计划
 */
@Mapper
public interface PlanMapper {
    /**
     * 生产计划查询
     * @return
     */
    List<Plan> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

    /**
     * 新增生产计划
     * @return
     */
    int findPostInsert(Plan p);

    /**
     * 查询单个生产计划
     * @return
     */
    Plan planIdSelect(String planId);

    /**
     * 根据planId删除单个计划
     * @return
     */
    int planIdDelete(String planId);

    /**
     *根据planId修改单个计划
     * @return
     */
    int findUpdate(Map map);
}
