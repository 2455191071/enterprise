package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.BomlbMapper;
import com.csdj.enterprise.entity.produce.Bomlb;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：物料清单
 */
@Service
public class BomlbServiceImpl implements BomlbService{
    @Resource
    private BomlbMapper dao;


    @Override
    public PageUtil<Bomlb> findSelect(int index, int size, String materialsId, String warehouseId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(!materialsId.equals("0")){
            map.put("materialsId", materialsId);
        }
        if(!warehouseId.equals("0")){
            map.put("warehouseId", warehouseId);
        }
        //调底层方法取相关数据
        List<Bomlb> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Bomlb> pu = new PageUtil<Bomlb>();

        pu.setListf(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public int findInsert(Bomlb b) {
        return dao.findInsert(b);
    }

    @Override
    public Bomlb bomIdSelect(String bomId) {
        return dao.bomIdSelect(bomId);
    }

    @Override
    public int bomIdDelete(String bomId) {
        return dao.bomIdDelete(bomId);
    }

    @Override
    public int findUpdate(String id, Bomlb b) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("warehouseId",b.getWarehouseId());
        map.put("note",b.getNote());
        return dao.findUpdate(map);
    }
}
