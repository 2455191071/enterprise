package com.csdj.enterprise.service.personnel;

import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.LaborContract;
import com.csdj.enterprise.util.PageUtil;

import java.util.List;

public interface LaborContractService {
    /**
     * 添加信息
     * @param lab
     * @return
     */
    int add(LaborContract lab);

    /**
     * 带条件分页查询
     * @param Id
     * @param contractType
     * @param officeClerk
     * @param currentage
     * @param pageSize
     * @return
     */
    PageUtil<LaborContract> page(String Id,String contractType,String officeClerk,int currentage, int pageSize);

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
}
