package com.csdj.enterprise.service.personnel;

import com.csdj.enterprise.entity.personnel.Consider;
import com.csdj.enterprise.entity.personnel.Employment;
import com.csdj.enterprise.util.PageUtil;

public interface EmploymentService {

    PageUtil<Employment> page(String name, String sex,String state, int currentage, int pageSize);
    /**
     * 查询总记录数
     * @return
     */
    int getCount();
}
