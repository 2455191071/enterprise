package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.entity.produce.Outsourcing;
import com.csdj.enterprise.controller.produce.util.PageUtil;

/**
 * 李邦
 * Service层：外协单
 */
public interface OutsourcingService {
    /**
     * 外协单查询
     * @return
     */
    PageUtil<Outsourcing> findSelect(int index, int size,String supplierId,String contactId,int outsourcerId);

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
    int findUpdate(String id,Outsourcing o);
}
