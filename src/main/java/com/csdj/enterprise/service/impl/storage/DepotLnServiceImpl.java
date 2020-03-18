package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.DepotLnDao;
import com.csdj.enterprise.entity.storage.Depot;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.DepotLnService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 仓库业务逻辑层的imp
 */
@Service
public class DepotLnServiceImpl implements DepotLnService {
    @Resource
    DepotLnDao dao;

    @Override
    public List<Depot> findById(String depotId) {

        return dao.findById(depotId);
    }

    @Override
    public PageUtil<Depot> findPage(int index, int pageSize, String depotId, String department, String remark) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Depot> page=new PageUtil<Depot>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (depotId!=null) {
            map.put("depotId", depotId);
        }
        if (department!=null) {
            map.put("department", department);
        }
        if (remark!=null) {
            map.put("remark", remark);
        }

        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(depotId,department,remark);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String depotId, String department, String remark) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("depotId", depotId);
        map.put("department", department);
        map.put("remark", remark);


        return dao.Count(map);
    }
}
