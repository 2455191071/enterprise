package com.csdj.enterprise.dao.interflow;

import com.csdj.enterprise.entity.interflow.information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InterMapper {
    /*查询技术部内数据*/
    List<information> selectKnow(@Param("ID")String ID,
                                 @Param("title")String title);
    /*添加技术部信息*/
    int addknow(information information);
}
