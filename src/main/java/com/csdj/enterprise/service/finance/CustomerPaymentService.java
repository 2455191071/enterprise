package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;
import java.util.Map;

public interface CustomerPaymentService {
    /**
     * 条件分页查询
     * @param Id
     * @param client
     * @param salesman
     * @param currentage
     * @param pageSize
     * @return
     */
    PageUtil<CustomerPayment> page(String Id,String client,String salesman,int currentage,int pageSize );

    /**
     * 查询总记录数
     * @return
     */
    int getCount();

    /**
     * 添加信息
     * @param cust
     * @return
     */
    int add(CustomerPayment cust);

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


}
