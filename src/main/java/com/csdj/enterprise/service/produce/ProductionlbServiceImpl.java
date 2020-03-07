package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.ProductionlbMapper;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import com.csdj.enterprise.entity.produce.Productionlb;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：集中生产
 */
@Service
public class ProductionlbServiceImpl implements ProductionlbService{
    @Resource
    private ProductionlbMapper dao;

    @Override
    public PageUtil<Productionlb> findSelect(int index,int size,String documentId,String materialsId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(!documentId.equals("0")){
            map.put("documentId", documentId);
        }
        if(!materialsId.equals("0")){
            map.put("materialsId", materialsId);
        }
        //调底层方法取相关数据
        List<Productionlb> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Productionlb> pu = new PageUtil<Productionlb>();

        pu.setList(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }


}
