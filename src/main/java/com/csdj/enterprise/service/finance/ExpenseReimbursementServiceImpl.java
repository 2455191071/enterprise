package com.csdj.enterprise.service.finance;

import com.csdj.enterprise.dao.finance.ExpenseReimbursementDao;
import com.csdj.enterprise.entity.finance.ExpenseReimbursement;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExpenseReimbursementServiceImpl implements ExpenseReimbursementService {
    @Resource
    ExpenseReimbursementDao dao;
    @Override
    public PageUtil<ExpenseReimbursement> page(String Id, String reimbursement, int currentage, int pageSize) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("Id", Id);
        map.put("reimbursement", reimbursement);
        map.put("currentage", (currentage-1)*pageSize);
        map.put("pageSize", pageSize);
        PageUtil<ExpenseReimbursement> tool=new PageUtil<ExpenseReimbursement>();
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
    public int add(ExpenseReimbursement exp) {
        return dao.add(exp);
    }

    @Override
    public List<Clerk> selectClerkName() {
        return dao.selectClerkName();
    }
}
