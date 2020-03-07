package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.ManagementDao;
import com.csdj.enterprise.entity.storage.Management;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.ManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 莫宏峡
 * 库存流水管理业务逻辑层Impl
 */
@Service
public class ManagementServiceImpl implements ManagementService {
        @Resource
         ManagementDao dao;

    @Override
    public List<Management> findById(String managementId) {
        return dao.findById(managementId);
    }

    @Override
    public PageUtil<Management> findPage(int index, int pageSize, String commodityId, String managementDate, String Date, String wareId) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Management> page=new PageUtil<Management>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (commodityId!=null) {
            map.put("commodityId", commodityId);
        }
        if (managementDate!=null) {
            map.put("managementDate", managementDate);
        }
        if (Date!=null) {
            map.put("Date", Date);
        }
        if (wareId!=null) {
            map.put("wareId", wareId);
        }
        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(commodityId,managementDate,Date,wareId);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String commodityId, String managementDate, String Date, String wareId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("commodityId", commodityId);
        map.put("managementDate", managementDate);
        map.put("Date", Date);
        map.put("wareId", wareId);


        return dao.Count(map);
    }
}
