package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.entity.finance.ExpenseReimbursement;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;

public interface ExpenseReimbursementService {
    /**
     * 分页查询所有信息
     * @return
     */
    PageUtil<ExpenseReimbursement> page(String Id,String reimbursement,int currentage,int pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int getCount();

    /**
     * 添加信息
     * @param exp
     * @return
     */
    int add(ExpenseReimbursement exp);

    /**
     * 查询所有职员
     * @return
     */
    List<Clerk> selectClerkName();
}
