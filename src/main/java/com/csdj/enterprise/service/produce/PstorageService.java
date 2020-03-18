package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Pstorage;
import com.csdj.enterprise.controller.produce.util.PageUtil;


/**
 * 李邦
 * Service层：生产入库
 */
public interface PstorageService {
    /**
     * 生产入库查询
     * @return
     */
    PageUtil<Pstorage> findSelect(int index, int size,String warehouseId,String planId);

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
    int findUpdate(String id,Pstorage p);
}
