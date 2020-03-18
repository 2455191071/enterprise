package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.entity.finance.CustomerReceivableAdjustment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;
import java.util.Map;

public interface CustomerReceivableAdjustmentService {
    /**
     * 条件分页查询
     * @return
     */
    PageUtil<CustomerReceivableAdjustment> page(String Id,String client,String handled,int currentage,int pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int getCount();

    /**
     * 添加信息
     * @param cra
     * @return
     */
    int add(CustomerReceivableAdjustment cra);

    /**
     * 修改信息
     * @param cra
     * @return
     */
    int update(CustomerReceivableAdjustment cra);

    /**
     * 删除信息
     * @param Id
     * @return
     */
    int delete(String Id);

    /**
     * 查询所有职员
     * @return
     */
    List<Clerk> selectClerkName();

    /**
     * 根据ID查询
     * @param Id
     * @return
     */
    List<CustomerReceivableAdjustment> findById(String Id);
}
