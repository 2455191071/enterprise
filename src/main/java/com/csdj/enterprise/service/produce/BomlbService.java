package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Bomlb;
import com.csdj.enterprise.controller.produce.util.PageUtil;


/**
 * 李邦
 * Service层：物料清单
 */
public interface BomlbService {
    /**
     * 物料清单查询
     * @return
     */
    PageUtil<Bomlb> findSelect(int index, int size, String materialsId, String warehouseId);

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
    int findUpdate(String id,Bomlb b);
}
