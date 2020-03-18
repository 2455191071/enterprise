package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.ExpenseReimbursement;
import com.csdj.enterprise.entity.personnel.Clerk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ExpenseReimbursementDao {
    /**
     * 分页查询所有信息
     * @return
     */
    List<ExpenseReimbursement> selectAll(Map map);

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
