package com.csdj.enterprise.controller.personnel;

import com.csdj.enterprise.entity.personnel.Employment;
import com.csdj.enterprise.service.personnel.EmploymentService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmploymentController {
    @Autowired
    EmploymentService service;
    @RequestMapping("CHemployment")
    public String consider(@RequestParam(defaultValue="1")int index, String name, String sex, String state,Model model){
        PageUtil<Employment> list = service.page(name,sex,state,index,10);
        model.addAttribute("info",list);
        return "personnel/Employment";
    }
}
