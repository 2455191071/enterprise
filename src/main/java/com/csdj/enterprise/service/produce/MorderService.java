package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Morder;
import com.csdj.enterprise.controller.produce.util.PageUtil;

/**
 * 李邦
 * Service层：制令单
 */
public interface MorderService {
    /**
     * 制令单查询
     * @return
     */
    PageUtil<Morder> findSelect(int index, int size, int mrp, String productId);

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
    int findUpdate(String id,Morder m);
}
