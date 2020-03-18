package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.dao.finance.CustomerPaymentDao;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerPaymentServiceImpl implements CustomerPaymentService {
    @Resource
    CustomerPaymentDao dao;
    @Override
    public PageUtil<CustomerPayment> page(String Id, String client, String salesman, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("Id", Id);
        map.put("client", client);
        map.put("salesman", salesman);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<CustomerPayment> tool=new PageUtil<CustomerPayment>();
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
    public int add(CustomerPayment cust) {
        return dao.add(cust);
    }

    @Override
    public int delete(String Id) {
        return dao.delete(Id);
    }

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }


}
