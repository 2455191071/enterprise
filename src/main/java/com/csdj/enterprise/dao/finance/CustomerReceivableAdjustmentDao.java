package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.CustomerReceivableAdjustment;
import com.csdj.enterprise.entity.personnel.Clerk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerReceivableAdjustmentDao {
    /**
     * 条件分页查询
     * @param map
     * @return
     */
    List<CustomerReceivableAdjustment> selectAll(Map map);

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
