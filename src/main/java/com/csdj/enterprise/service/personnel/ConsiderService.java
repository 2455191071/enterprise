package com.csdj.enterprise.service.personnel;

import com.csdj.enterprise.entity.personnel.Consider;
import com.csdj.enterprise.util.PageUtil;

public interface ConsiderService {
    /**
     * 带条件分页查询
     * @param name
     * @param sex
     * @param currentage
     * @param pageSize
     * @return
     */
    PageUtil<Consider>page(String name,String sex,int currentage,int pageSize);
    /**
     * 查询总记录数
     * @return
     */
    int getCount();
}
