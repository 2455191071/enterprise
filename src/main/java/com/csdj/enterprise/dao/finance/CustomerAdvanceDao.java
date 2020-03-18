package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.CustomerAdvance;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerAdvanceDao {
    /**
     * 条件分页查询
     * @param map
     * @return
     */
    List<CustomerAdvance> selectAll(Map map);
    /**
     * 查询总记录数
     * @return
     */
    int getCount();

    /**
     * 添加信息
     * @param advance
     * @return
     */
    int add(CustomerAdvance advance);

    /**
     * 删除信息
     * @param receiptId
     * @return
     */
    int delete(String receiptId);

    /**
     * 查询所有职员
     * @return
     */
    List<Clerk> selectClerkName();

    /**
     * 查询所有部门职位
     * @return
     */
    List<Position> selectPositionName();
}
