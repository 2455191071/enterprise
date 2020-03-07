package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Ostorage;
import com.csdj.enterprise.controller.produce.util.PageUtil;


/**
 * 李邦
 * Service层：外协入库
 */
public interface OstorageService {
    /**
     * 外协入库查询
     * @return
     */
    PageUtil<Ostorage> findSelect(int index, int size,String ostorageId,String productId,String warehouseId);

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
    int findUpdate(String id,Ostorage o);
}
