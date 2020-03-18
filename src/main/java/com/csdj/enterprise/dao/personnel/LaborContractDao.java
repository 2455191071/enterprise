package com.csdj.enterprise.dao.personnel;

import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.LaborContract;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LaborContractDao {
    /**
     * 添加信息
     * @param lab
     * @return
     */
    int add(LaborContract lab);

    /**
     * 分页条件查询
     * @param map
     * @return
     */
    List<LaborContract> selectAll(Map map);

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
