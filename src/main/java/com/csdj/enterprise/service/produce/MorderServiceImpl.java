package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.MorderMapper;
import com.csdj.enterprise.entity.produce.Morder;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：制令单
 */
@Service
public class MorderServiceImpl implements MorderService{
    @Resource
    private MorderMapper dao;

    @Override
    public PageUtil<Morder> findSelect(int index, int size, int mrp, String productId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(mrp!=0){
            map.put("mrp", mrp);
        }
        if(!productId.equals("0")){
            map.put("productId", productId);
        }
        //调底层方法取相关数据
        List<Morder> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Morder> pu = new PageUtil<Morder>();

        pu.setListb(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public Morder morderIdSelect(String morderId) {
        return dao.morderIdSelect(morderId);
    }

    @Override
    public int morderIdDelete(String morderId) {
        return dao.morderIdDelete(morderId);
    }

    @Override
    public int findUpdate(String id, Morder m) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("morderId",m.getMorderId());
        map.put("productId",m.getProductId());
        map.put("mrp",m.getMrp());
        map.put("odate",m.getOdate());
        map.put("delivery",m.getDelivery());
        map.put("planId",m.getPlanId());
        map.put("warehouseId",m.getWarehouseId());
        map.put("superior",m.getSuperior());
        map.put("quantity",m.getQuantity());
        map.put("qis",m.getQis());
        map.put("qicmo",m.getQicmo());
        map.put("dss",m.getDss());
        map.put("cbmditw",m.getCbmditw());
        map.put("warehouse",m.getWarehouse());
        map.put("note",m.getNote());
        return dao.findUpdate(map);
    }
}
