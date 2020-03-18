package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.ApplyDepartment;
import com.csdj.enterprise.entity.finance.CostType;
import com.csdj.enterprise.entity.finance.PersonApply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: dao层接口
 * @author: Yin jie
 * @create: 2020-02-18 12:44
 **/
@Repository("personApplyMapper")
public interface PersonApplyMapper {
    /**
     * 查询部门信息
     *
     * @return
     */
    public List<ApplyDepartment> findDepartment();

    /**
     * 查询费用类型信息
     *
     * @return
     */
    public List<CostType> findCostType();

    /**
     * 查询过账信息
     *
     * @return
     */
    public List<PersonApply> findPost();

    /**
     * 根据typeId,applyDepartmentId查询并进行分页
     *
     * @param typeId
     * @param applyDepartmentId
     * @param begindate
     * @param paydate
     * @param currPage          当前页码
     * @param pageSize          每页条数
     * @return
     */
    public List<PersonApply> findpInfoName(@Param("typeId") Integer typeId,
                                           @Param("applyDepartmentId") Integer applyDepartmentId,
                                           @Param("begindate") Date begindate,
                                           @Param("paydate") Date paydate,
                                           @Param("currPage") int currPage, @Param("pageSize") int pageSize);

    /**
     * 查询记录总条数
     *
     * @param
     * @return
     */
    public int findTypeNameCount();

    /**
     * 根据ID删除数据
     *
     * @param applyId
     * @return
     */
    public int delById(
            @Param("applyId") int applyId);

    /**
     * 根据id查询数据
     *
     * @param applyId
     * @return
     */
    public PersonApply findById(@Param("applyId") int applyId);

    /**
     * 修改数据
     *
     * @param personApply
     * @return
     */
    public int update(PersonApply personApply);

    /**
     * 添加信息
     *
     * @param personApply
     * @return
     */
    public int add(PersonApply personApply);

}

