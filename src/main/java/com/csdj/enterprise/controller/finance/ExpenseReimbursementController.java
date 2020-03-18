package com.csdj.enterprise.controller.finance;

import com.csdj.enterprise.entity.finance.ExpenseReimbursement;
import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.service.finance.ExpenseReimbursementService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ExpenseReimbursementController {
    @Autowired
    ExpenseReimbursementService service;

    @RequestMapping("CHExpenseReimbursement")
    public String index(@RequestParam(defaultValue="1")int index, String Id, String reimbursement, Model model){
        PageUtil<ExpenseReimbursement> list = service.page(Id,reimbursement,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "finance/ExpenseReimbursement";
    }

    @RequestMapping("addExpenseReimbursement")
    public String add(Model model){
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "finance/AddExpenseReimbursementInfo";
    }
    @RequestMapping("insertExpenseReimbursement")
    public String insert(ExpenseReimbursement exp){
        int res = service.add(exp);
        return "redirect:CHExpenseReimbursement";
    }
}
