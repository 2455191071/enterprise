package com.csdj.enterprise.service.interflow;

import com.csdj.enterprise.entity.interflow.information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InterService {
   /* 查询技术部内数据*/
    List<information> selectKnow(String ID, String title);

    /*添加技术部信息*/
    int addknow(information information);
}
