package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerPaymentDao {
    /**
     * 条件分页查询
     * @param map
     * @return
     */
    List<CustomerPayment> selectAll(Map map);

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
