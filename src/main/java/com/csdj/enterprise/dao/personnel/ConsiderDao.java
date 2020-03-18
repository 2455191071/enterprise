package com.csdj.enterprise.dao.personnel;

import com.csdj.enterprise.entity.personnel.Consider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ConsiderDao {
    /**
     * 分页查询所有信息
     * @return
     */
    List<Consider> selectAll(Map map);

    /**
     * 查询总记录数
     * @return
     */
    int getCount();
}
