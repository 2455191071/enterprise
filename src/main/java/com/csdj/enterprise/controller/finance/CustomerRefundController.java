package com.csdj.enterprise.controller.finance;

import com.alibaba.fastjson.JSON;
import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.finance.CustomerRefund;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.service.finance.CustomerRefundService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerRefundController {
    @Autowired
    CustomerRefundService service;

    @RequestMapping("CHCustomerRefund")
    public String index(@RequestParam(defaultValue="1")int index, String Id, String client, String salesman, Model model){
        PageUtil<CustomerRefund> list = service.page(Id,client,salesman,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/CustomerRefund";
    }

    @RequestMapping("addCustomerRefund")
    public String add(Model model){
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "finance/AddCustomerRefund";
    }
    @RequestMapping("insertCustomerRefund")
    public String insert(CustomerRefund cust){
        int res = service.add(cust);
        return "redirect:CHCustomerRefund";
    }

    @RequestMapping("delCustomerRefund/{Id}")
    public String delete( @PathVariable("Id")String Id) {
        service.delete(Id);
        return "redirect:/CHCustomerRefund";
    }


    @RequestMapping("updCustomerRefund/{Id}")
    public String update(@PathVariable("Id")String Id,Model model){
        List<CustomerRefund> list = service.findById(Id);
        model.addAttribute("list",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/UpdateCustomerRefund";
    }

    @RequestMapping("editCustomerRefund")
    public String edit(CustomerRefund cust){
        service.update(cust);
        return "redirect:/CHCustomerRefund";
    }
}
