package com.csdj.enterprise.controller.finance;

import com.csdj.enterprise.entity.finance.CustomerPayment;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.service.finance.CustomerPaymentService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerPaymentController {
    @Autowired
    CustomerPaymentService service;

    @RequestMapping("CHCustomerPayment")
    public  String index(@RequestParam(defaultValue="1")int index, String Id, String client, String salesman,Model model){
        PageUtil<CustomerPayment> list = service.page(Id,client,salesman,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/CustomerPayment";
    }

    @RequestMapping("addCustomerPayment")
    public String add(Model model){
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "finance/AddCustomerPayment";
    }
    @RequestMapping("insertCustomerPayment")
    public String insert(CustomerPayment exp){
        int res = service.add(exp);
        return "redirect:CHCustomerPayment";
    }

    @RequestMapping("delCustomerPayment/{Id}")
    public String delete(@PathVariable("Id") String Id) {
        service.delete(Id);
        return "redirect:/CHCustomerPayment";
    }
}
