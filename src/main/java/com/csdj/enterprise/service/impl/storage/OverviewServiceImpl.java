package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.OverviewDao;
import com.csdj.enterprise.entity.storage.Lnventory;
import com.csdj.enterprise.entity.storage.Overview;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.OverviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 库存总览业务逻辑层的imp
 */
@Service
public class OverviewServiceImpl implements OverviewService {
    @Resource
    OverviewDao dao;

    @Override
    public List<Overview> findById(String overviewId) {
        return dao.findById(overviewId);
    }

    @Override
    public PageUtil<Overview> findPage(int index, int pageSize, String commodityId, String wareId) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Overview> page=new PageUtil<Overview>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (commodityId!=null) {
            map.put("commodityId", commodityId);
        }

        if (wareId!=null) {
            map.put("wareId", wareId);
        }

        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(wareId,commodityId);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count( String commodityId, String wareId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("commodityId", commodityId);
        map.put("wareId", wareId);



        return dao.Count(map);
    }

    @Override
    public int add(Overview overview) {
        return dao.add(overview);
    }
}
