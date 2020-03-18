package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.CustomerRefund;
import com.csdj.enterprise.entity.personnel.Clerk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerRefundDao {
    /**
     * 条件分页查询
     * @param map
     * @return
     */
    List<CustomerRefund> selectAll(Map map);

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
