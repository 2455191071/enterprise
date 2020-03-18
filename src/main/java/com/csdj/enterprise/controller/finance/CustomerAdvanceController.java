package com.csdj.enterprise.controller.finance;

import com.csdj.enterprise.dao.finance.CustomerAdvanceDao;
import com.csdj.enterprise.entity.finance.CustomerAdvance;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.Position;
import com.csdj.enterprise.service.finance.CustomerAdvanceService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerAdvanceController {
    @Autowired
    CustomerAdvanceService service;
    @RequestMapping("CHCustomerAdvance")
    public String index(@RequestParam(defaultValue="1")int index, String receiptId, String client, String salesman, Model model){
        PageUtil<CustomerAdvance> list = service.page(receiptId,client,salesman,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/CustomerAdvance";
    }
    @RequestMapping("addCustomerAdvance")
    public String add(Model model){
        List<Position> positionName = service.selectPositionName();
        model.addAttribute("positionInfo",positionName);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "finance/AddCustomerAdvance";
    }
    @RequestMapping("insertCustomerAdvance")
    public String insert(CustomerAdvance advance){
        int res = service.add(advance);
        return "redirect:CHCustomerAdvance";
    }

    @RequestMapping("delCustomerAdvance/{receiptId}")
    public String delete(@PathVariable("receiptId") String receiptId) {
        service.delete(receiptId);
        return "redirect:/CHCustomerAdvance";
    }
}
