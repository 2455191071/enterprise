package com.csdj.enterprise.dao.finance;

import com.csdj.enterprise.entity.finance.Provider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: dao层接口
 * @author: Yin jie
 * @create: 2020-02-14 18:55
 **/
@Repository("providerMapper")
public interface ProviderMapper {
    /**
     *根据provider模糊查询并进行分页
     * @param provider
     * @param begindate
     * @param paydate
     * @param currPage 当前页码
     * @param pageSize 每页条数
     * @return
     */
    public List<Provider> findpInfoName(@Param("provider") String provider,
                                        @Param("begindate") Date begindate,
                                        @Param("paydate") Date paydate,
                                        @Param("currPage") int currPage, @Param("pageSize") int pageSize);
    /**
     * 查询记录总条数
     * @param provider
     * @return
     */
    public int findTypeNameCount(
            @Param("provider") String provider);

    /**
     * 根据ID删除数据
     * @param providerId
     * @return
     */
    public int delById(
            @Param("providerId") int providerId);

    /**
     * 根据id查询数据
     * @param providerId
     * @return
     */
    public Provider findById(@Param("providerId") int providerId);

    /**
     * 修改数据
     * @param provider
     * @return
     */
    public int update(Provider provider);

    /**
     * 添加信息
     * @param product
     * @return
     */
    public int add(Provider product);

}
