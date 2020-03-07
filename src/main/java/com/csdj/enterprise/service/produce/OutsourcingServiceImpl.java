package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.OutsourcingMapper;
import com.csdj.enterprise.entity.produce.Outsourcing;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：外协单
 */
@Service
public class OutsourcingServiceImpl implements OutsourcingService{
    @Resource
    private OutsourcingMapper dao;

    @Override
    public PageUtil<Outsourcing> findSelect(int index, int size, String supplierId, String contactId, int outsourcerId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(outsourcerId!=0){
            map.put("outsourcerId", outsourcerId);
        }
        if(!supplierId.equals("0")){
            map.put("supplierId", supplierId);
        }
        if(!contactId.equals("0")){
            map.put("contactId", contactId);
        }
        //调底层方法取相关数据
        List<Outsourcing> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Outsourcing> pu = new PageUtil<Outsourcing>();

        pu.setListc(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public Outsourcing outsourcingIdSelect(String outsourcingId) {
        return dao.outsourcingIdSelect(outsourcingId);
    }

    @Override
    public int outsourcingIdDelete(String outsourcingId) {
        return dao.outsourcingIdDelete(outsourcingId);
    }

    @Override
    public int findUpdate(String id, Outsourcing o) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("outsourcingId",o.getOutsourcingId());
        map.put("productId",o.getProductId());
        map.put("mrp",o.getMrp());
        map.put("date",o.getDate());
        map.put("delivery",o.getDelivery());
        map.put("planId",o.getPlanId());
        map.put("quantity",o.getQuantity());
        map.put("warehouse",o.getWarehouse());
        map.put("stored",o.getStored());
        map.put("supplierId",o.getSupplierId());
        map.put("contactId",o.getContactId());
        map.put("outsourcerId",o.getOutsourcerId());
        map.put("note",o.getNote());
        map.put("annex",o.getAnnex());
        return dao.findUpdate(map);
    }
}
