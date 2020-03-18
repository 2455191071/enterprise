package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.entity.finance.CustomerRefund;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;

public interface CustomerRefundService {
    /**
     * 条件分页查询
     * @param Id
     * @param client
     * @param salesman
     * @param currentage
     * @param pageSize
     * @return
     */
    PageUtil<CustomerRefund> page(String Id,String client,String salesman,int currentage,int pageSize);

    /**
     * 添加信息
     * @param cust
     * @return
     */
    int add(CustomerRefund cust);

    /**
     * 删除信息
     * @param Id
     * @return
     */
    int delete (String Id);

    /**
     * 修改信息
     * @param cust
     * @return
     */
    int update(CustomerRefund cust);

    /**
     * 查询总记录数
     * @return
     */
    int getCount();

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
    List<CustomerRefund> findById(String Id);
}
