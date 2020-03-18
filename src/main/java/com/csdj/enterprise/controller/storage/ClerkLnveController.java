package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.personnel.Clerk;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.ClerkLnveServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 莫宏峡
 * 职员信息实现层
 */
@Controller
@RequestMapping("clerkln")
public class ClerkLnveController {
    @Resource
    ClerkLnveServiceImpl imp;

    /**
     * 职员信息查询
     * @param index
     * @param clerkName
     * @param offPhone
     * @param model
     * @return
     */
    @RequestMapping("cllist")
    public String ClerkLnveList(@RequestParam(defaultValue="1")int index, String clerkName, String offPhone, Model model) {

        PageUtil<Clerk> cllist =imp.findPage(index,8,clerkName,offPhone);
        model.addAttribute("cllist", cllist);
        model.addAttribute("clerkName",clerkName);
        model.addAttribute("offPhone",offPhone);



        return "storage/ClerkLnvelist";

    }
}
