package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.Repertory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: 接口
 * @author: Yin jie
 * @create: 2020-02-17 18:51
 **/
@Repository("repertoryMapper")
public interface RepertoryMapper {
    /**
     *根据warehouse模糊查询并进行分页
     * @param warehouse
     * @param commodity
     * @param remarks
     * @param date
     * @param currPage 当前页码
     * @param pageSize 每页条数
     * @return
     */
    public List<Repertory> findByAll(@Param("warehouse") String warehouse,
                                     @Param("commodity") String commodity,
                                     @Param("remarks") String remarks,
                                     @Param("date") Date date,
                                     @Param("currPage") int currPage, @Param("pageSize") int pageSize);
    /**
     * 查询记录总条数
     * @param warehouse
     * @return
     */
    public int findTypeNameCount(
            @Param("warehouse") String warehouse);

    /**
     * 根据ID删除数据
     * @param warehouseId
     * @return
     */
    public int delById(
            @Param("warehouseId") int warehouseId);

    /**
     * 根据id查询数据
     * @param warehouseId
     * @return
     */
    public Repertory findById(@Param("warehouseId") int warehouseId);

    /**
     * 修改数据
     * @param repertory
     * @return
     */
    public int update(Repertory repertory);

    /**
     * 添加信息
     * @param repertory
     * @return
     */
    public int add(Repertory repertory);
}
