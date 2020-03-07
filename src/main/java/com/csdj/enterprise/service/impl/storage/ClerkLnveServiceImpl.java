package com.csdj.enterprise.service.impl.storage;

import com.csdj.enterprise.dao.storage.ClerkLnveDao;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.storage.ClerkLnveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 莫宏峡
 * 职员信息业务逻辑层Impl
 */
@Service
public class ClerkLnveServiceImpl implements ClerkLnveService {
    @Resource
    ClerkLnveDao dao;

    @Override
    public PageUtil<Clerk> findPage(int index, int pageSize, String clerkName, String offPhone) {
        Map<String, Object> map=new HashMap<String, Object>();
        PageUtil<Clerk> page=new PageUtil<Clerk>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (clerkName!=null) {
            map.put("clerkName", clerkName);
        }
        if (offPhone!=null) {
            map.put("offPhone", offPhone);
        }


        page.setList(dao.findPage(map));
        page.setPageIndex(index);
        page.setPageSize(pageSize);
        int count=Count(clerkName,offPhone);
        page.setRowCount(count);
        if(count%pageSize==0) {
            page.setPageNumber(count/pageSize);
        }else {
            page.setPageNumber(count/pageSize+1);
        }
        return page;
    }

    @Override
    public int Count(String clerkName, String offPhone) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("clerkName", clerkName);
        map.put("offPhone", offPhone);



        return dao.Count(map);
    }
}
