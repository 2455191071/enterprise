package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.entity.finance.CustomerAdvance;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.Position;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;

public interface CustomerAdvanceService {
    /**
     * 条件分页查询
     * @param receiptId
     * @param client
     * @param salesman
     * @param currentage
     * @param pageSize
     * @return
     */
    PageUtil<CustomerAdvance> page(String receiptId, String client, String salesman, int currentage, int pageSize );

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
