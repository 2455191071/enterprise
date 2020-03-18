package com.csdj.enterprise.service.personnel;

import com.csdj.enterprise.dao.personnel.ConsiderDao;
import com.csdj.enterprise.entity.personnel.Consider;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConsiderServiceImpl implements ConsiderService{
    @Resource
    ConsiderDao dao;
    @Override
    public PageUtil<Consider> page(String name, String sex, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("name", name);
        map.put("sex", sex);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<Consider> tool=new PageUtil<Consider>();
        tool.setList(dao.selectAll(map));
        tool.setCurrentPage(currentage);
        tool.setPageSize(pageSize);
        tool.setTotalCount(getCount());
        int count=getCount();
        if(count%pageSize==0) {
            tool.setTotalPage(count/pageSize);
        }else {
            tool.setTotalPage(count/pageSize+1);
        }
        return tool;
    }

    @Override
    public int getCount() {
        return dao.getCount();
    }
}
