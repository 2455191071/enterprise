package com.csdj.enterprise.dao.personnel;

import com.csdj.enterprise.entity.personnel.Employment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface EmploymentDao {
    /**
     * 分页查询
     * @param map
     * @return
     */
    List<Employment> selectAll(Map map);
    /**
     * 查询总记录数
     * @return
     */
    int getCount();
}
