package com.csdj.enterprise.dao.produce;
/**
 * 李邦
 * Dao层：集中生产
 */
import com.csdj.enterprise.entity.produce.Productionlb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductionlbMapper {
    /**
     * 集中生产查询
     * @return
     */
    List<Productionlb> findSelect(Map map);

    /**
     * 数据总条数
     * @return
     */
    int total(Map map);

}
