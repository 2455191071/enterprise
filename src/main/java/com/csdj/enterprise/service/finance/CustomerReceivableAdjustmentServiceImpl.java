package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.dao.finance.CustomerReceivableAdjustmentDao;
import com.csdj.enterprise.entity.finance.CustomerReceivableAdjustment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerReceivableAdjustmentServiceImpl implements CustomerReceivableAdjustmentService {
    @Resource
    CustomerReceivableAdjustmentDao dao;
    @Override
    public PageUtil<CustomerReceivableAdjustment> page(String Id, String client, String handled, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("Id", Id);
        map.put("client", client);
        map.put("handled", handled);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<CustomerReceivableAdjustment> tool=new PageUtil<CustomerReceivableAdjustment>();
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
    public int add(CustomerReceivableAdjustment cra) {
        return dao.add(cra);
    }

    @Override
    public int update(CustomerReceivableAdjustment cra) {
        return dao.update(cra);
    }

    @Override
    public int delete(String Id) {
        return dao.delete(Id);
    }

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }

    @Override
    public List<CustomerReceivableAdjustment> findById(String Id) {
        return dao.findById(Id);
    }
}
