package com.csdj.enterprise.controller.finance;

import com.csdj.enterprise.entity.finance.CustomerReceivableAdjustment;
import com.csdj.enterprise.entity.finance.CustomerRefund;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.service.finance.CustomerReceivableAdjustmentService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerReceivableAdjustmentController {
    @Autowired
    CustomerReceivableAdjustmentService service;

    @RequestMapping("CHCustomerReceivableAdjustment")
    public String index(@RequestParam(defaultValue="1")int index, String Id, String client, String handled, Model model){
        PageUtil<CustomerReceivableAdjustment> list = service.page(Id,client,handled,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/CustomerReceivableAdjustment";
    }

    @RequestMapping("addCustomerReceivableAdjustment")
    public String add(Model model){
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "finance/AddCustomerReceivableAdjustment";
    }
    @RequestMapping("insertCustomerReceivableAdjustment")
    public String insert(CustomerReceivableAdjustment cra){
        int res = service.add(cra);
        return "redirect:CHCustomerReceivableAdjustment";
    }

    @RequestMapping("delCustomerReceivableAdjustment/{Id}")
    public String delete( @PathVariable("Id")String Id) {
        service.delete(Id);
        return "redirect:/CHCustomerReceivableAdjustment";
    }

    @RequestMapping("updCustomerReceivableAdjustment/{Id}")
    public String update(@PathVariable("Id")String Id,Model model){
        List<CustomerReceivableAdjustment> list = service.findById(Id);
        model.addAttribute("list",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/UpdateCustomerReceivableAdjustment";
    }

    @RequestMapping("editCustomerReceivableAdjustment")
    public String edit(CustomerReceivableAdjustment cra){
        service.update(cra);
        return "redirect:/CHCustomerReceivableAdjustment";
    }
}
