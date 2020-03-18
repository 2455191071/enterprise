package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.dao.finance.CustomerAdvanceDao;
import com.csdj.enterprise.entity.finance.CustomerAdvance;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.Position;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerAdvanceServiceImpl implements CustomerAdvanceService {
    @Resource
    CustomerAdvanceDao dao;
    @Override
    public PageUtil<CustomerAdvance> page(String receiptId, String client, String salesman, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("receiptId", receiptId);
        map.put("client", client);
        map.put("salesman", salesman);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<CustomerAdvance> tool=new PageUtil<CustomerAdvance>();
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
    public int add(CustomerAdvance advance) {
        return dao.add(advance);
    }

    @Override
    public int delete(String receiptId) {
        return dao.delete(receiptId);
    }

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }

    @Override
    public List<Position> selectPositionName() {
        return dao.selectPositionName();
    }
}
