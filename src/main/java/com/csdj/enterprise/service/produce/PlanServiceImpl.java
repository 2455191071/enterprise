package com.csdj.enterprise.service.produce;

import com.csdj.enterprise.dao.produce.PlanMapper;
import com.csdj.enterprise.entity.produce.Plan;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 李邦
 * Service实现层：生产计划
 */
@Service
public class PlanServiceImpl implements PlanService{
    @Resource
    private PlanMapper dao;
    @Override
    public PageUtil<Plan> findSelect(int index, int size, String productId) {
        //封装查询条件
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", (index-1)*size);
        map.put("end", size);
        if(!productId.equals("0")){
            map.put("productId", productId);
        }
        //调底层方法取相关数据
        List<Plan> list=dao.findSelect(map);
        int number=dao.total(map);

        //分页数据的封装
        PageUtil<Plan> pu = new PageUtil<Plan>();

        pu.setLista(list);
        pu.setPageIndex(index);
        pu.setPageSize(size);
        pu.setNumber(number);
        pu.setPageNumber((int)Math.ceil((double)number/size));
        return pu;
    }

    @Override
    public int findPostInsert(Plan p) {
        return dao.findPostInsert(p);
    }

    @Override
    public Plan planIdSelect(String planId) {
        return dao.planIdSelect(planId);
    }

    @Override
    public int planIdDelete(String planId) {
        return dao.planIdDelete(planId);
    }

    @Override
    public int findUpdate(String id, Plan p) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("planId",p.getPlanId());
        map.put("productId",p.getProductId());
        map.put("odate",p.getOdate());
        map.put("delivery",p.getDelivery());
        map.put("bomId",p.getBomId());
        map.put("quantity",p.getQuantity());
        map.put("demand",p.getDemand());
        map.put("term",p.getTerm());
        map.put("plannerId",p.getPlannerId());
        map.put("note",p.getNote());
        return dao.findUpdate(map);
    }
}
