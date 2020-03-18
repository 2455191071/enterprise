package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.PstorageMapper;
import com.csdj.enterprise.entity.produce.Pstorage;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：生产入库
 */
@Service
public class PstorageServiceImpl implements PstorageService{
    @Resource
    private PstorageMapper dao;

    @Override
    public PageUtil<Pstorage> findSelect(int index, int size, String warehouseId, String planId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(!warehouseId.equals("0")){
            map.put("warehouseId", warehouseId);
        }
        if(!planId.equals("0")){
            map.put("planId", planId);
        }
        //调底层方法取相关数据
        List<Pstorage> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Pstorage> pu = new PageUtil<Pstorage>();

        pu.setListd(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public Pstorage pstorageIdSelect(String pstorageId) {
        return dao.pstorageIdSelect(pstorageId);
    }

    @Override
    public int pstorageIdDelete(String pstorageId) {
        return dao.pstorageIdDelete(pstorageId);
    }

    @Override
    public int findUpdate(String id, Pstorage p) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("pstorageId",p.getPstorageId());
        map.put("date",p.getDate());
        map.put("morderId",p.getMorderId());
        map.put("workshop",p.getWorkshop());
        map.put("warehouseId",p.getWarehouseId());
        map.put("planId",p.getPlanId());
        map.put("handleId",p.getHandleId());
        map.put("note",p.getNote());
        map.put("manufacturingId",p.getManufacturingId());
        map.put("manufacturingdate",p.getManufacturingdate());
        map.put("modifyId",p.getModifyId());
        map.put("modifydate",p.getModifydate());
        return dao.findUpdate(map);
    }
}
