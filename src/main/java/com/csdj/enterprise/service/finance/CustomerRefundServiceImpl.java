package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.dao.finance.CustomerRefundDao;
import com.csdj.enterprise.entity.finance.CustomerRefund;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerRefundServiceImpl implements CustomerRefundService {
    @Resource
    CustomerRefundDao dao;
    @Override
    public PageUtil<CustomerRefund> page(String Id, String client, String salesman, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("Id", Id);
        map.put("client", client);
        map.put("salesman", salesman);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<CustomerRefund> tool=new PageUtil<CustomerRefund>();
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
    public int add(CustomerRefund cust) {
        return dao.add(cust);
    }

    @Override
    public int delete(String Id) {
        return dao.delete(Id);
    }

    @Override
    public int update(CustomerRefund cust) {
        return dao.update(cust);
    }

    @Override
    public int getCount() {
        return dao.getCount();
    }

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }

    @Override
    public List<CustomerRefund> findById(String Id) {
        return dao.findById(Id);
    }


}
