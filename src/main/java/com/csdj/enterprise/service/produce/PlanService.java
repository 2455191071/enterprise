package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Plan;
import com.csdj.enterprise.controller.produce.util.PageUtil;

/**
 * 李邦
 * Service层：生产计划
 */
public interface PlanService {
    /**
     * 集中生产查询
     * @return
     */
    PageUtil<Plan> findSelect(int index, int size, String productId);

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
    int findUpdate(String id,Plan p);
}
