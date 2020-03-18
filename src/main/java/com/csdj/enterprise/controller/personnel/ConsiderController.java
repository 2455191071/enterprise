package com.csdj.enterprise.controller.personnel;

import com.csdj.enterprise.entity.personnel.Consider;
import com.csdj.enterprise.service.personnel.ConsiderService;
import com.csdj.enterprise.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConsiderController {
    @Autowired
    ConsiderService service;
    @RequestMapping("CHconsider")
    public String index(@RequestParam(defaultValue="1")int index, String name,String sex, Model model){
        PageUtil<Consider> list = service.page(name,sex,index,10);
        model.addAttribute("info",list);
        return "personnel/Consider";
    }
}
