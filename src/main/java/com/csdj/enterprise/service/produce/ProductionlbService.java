package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.controller.produce.util.PageUtil;
import com.csdj.enterprise.entity.produce.Productionlb;

/**
 * 李邦
 * Service层：集中生产
 */
public interface ProductionlbService {
    /**
     * 集中生产查询
     * @return
     */
    PageUtil<Productionlb> findSelect(int index,int size,String documentId,String materialsId);

}
