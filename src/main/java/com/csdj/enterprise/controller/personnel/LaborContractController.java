package com.csdj.enterprise.controller.personnel;

import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.personnel.LaborContract;
import com.csdj.enterprise.service.personnel.LaborContractService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LaborContractController {
    @Autowired
    LaborContractService service;

    @RequestMapping("CHLaborContract")
    public String index(@RequestParam(defaultValue="1")int index, String Id, String contractType,String officeClerk, Model model){
        PageUtil<LaborContract> list = service.page(Id,contractType,officeClerk,index,5);
        model.addAttribute("info",list);
        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        return "personnel/LaborContract";
    }

    @RequestMapping("addLaborContract")
    public String add(Model model){

        List<Clerk> clerkName = service.selectClerkName();
        model.addAttribute("clerkInfo",clerkName);
        long Id = System.currentTimeMillis();
        String s = String.valueOf(Id);
        model.addAttribute("No",s);
        return "personnel/clerkAddInfo";
    }
    @RequestMapping("insertLaborContract")
    public String insert(LaborContract lab){
        int res = service.add(lab);
        return "redirect:CHLaborContract";
    }
}
