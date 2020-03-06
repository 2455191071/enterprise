package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.LotnumberDao;
import com.csdj.enterprise.entity.storage.Lotnumber;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.LotnumberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 批号库存管理表业务逻辑层Impl
 */
@Service
public class LotnumberServiceImpl implements LotnumberService {
    @Resource
    LotnumberDao dao;

    @Override
    public List<Lotnumber> findById(String lotnumberId) {
        return dao.findById(lotnumberId);
    }

    @Override
    public PageUtil<Lotnumber> findPage(int index, int pageSize, String commodityId, String lotnumberId) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Lotnumber> page=new PageUtil<Lotnumber>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (commodityId!=null) {
            map.put("commodityId", commodityId);
        }
        if (lotnumberId!=null) {
            map.put("lotnumberId", lotnumberId);
        }

        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(commodityId,lotnumberId);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String commodityId, String lotnumberId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("commodityId", commodityId);
        map.put("lotnumberId", lotnumberId);
        return dao.Count(map);
    }
}
