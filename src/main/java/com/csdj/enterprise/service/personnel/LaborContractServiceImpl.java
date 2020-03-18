package com.csdj.enterprise.service.personnel;

import com.csdj.enterprise.dao.personnel.LaborContractDao;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.Employment;
import com.csdj.enterprise.entity.personnel.LaborContract;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LaborContractServiceImpl implements LaborContractService {
    @Resource
    LaborContractDao dao;
    @Override
    public int add(LaborContract lab) {
        return dao.add(lab);
    }

    @Override
    public PageUtil<LaborContract> page(String Id, String contractType, String officeClerk, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("Id", Id);
        map.put("contractType", contractType);
        map.put("officeClerk", officeClerk);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<LaborContract> tool=new PageUtil<LaborContract>();
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

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }
}
