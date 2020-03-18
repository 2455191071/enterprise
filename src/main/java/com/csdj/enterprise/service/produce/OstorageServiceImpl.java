package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.OstorageMapper;
import com.csdj.enterprise.entity.produce.Ostorage;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：外协入库
 */
@Service
public class OstorageServiceImpl implements OstorageService{
    @Resource
    private OstorageMapper dao;

    @Override
    public PageUtil<Ostorage> findSelect(int index, int size, String ostorageId, String productId, String warehouseId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(!ostorageId.equals("0")){
            map.put("ostorageId", ostorageId);
        }
        if(!productId.equals("0")){
            map.put("productId", productId);
        }
        if(!warehouseId.equals("0")){
            map.put("warehouseId", warehouseId);
        }
        //调底层方法取相关数据
        List<Ostorage> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Ostorage> pu = new PageUtil<Ostorage>();

        pu.setListe(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public Ostorage ostorageIdSelect(String ostorageId) {
        return dao.ostorageIdSelect(ostorageId);
    }

    @Override
    public int ostorageIdDelete(String ostorageId) {
        return dao.ostorageIdDelete(ostorageId);
    }

    @Override
    public int findUpdate(String id, Ostorage o) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("ostorageId",o.getOstorageId());
        map.put("date",o.getDate());
        map.put("mrp",o.getMrp());
        map.put("outsourcingId",o.getOutsourcingId());
        map.put("productId",o.getProductId());
        map.put("number",o.getNumber());
        map.put("warehouseId",o.getWarehouseId());
        map.put("supplierId",o.getSupplierId());
        map.put("handleId",o.getHandleId());
        map.put("note",o.getNote());
        map.put("quantity",o.getQuantity());
        map.put("puprice",o.getPuprice());
        map.put("pcost",o.getPcost());
        map.put("mprice",o.getMprice());
        map.put("mcost",o.getMcost());
        map.put("amount",o.getAmount());
        return dao.findUpdate(map);
    }
}
