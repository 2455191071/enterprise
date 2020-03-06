package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Depot;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.DepotLnServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 莫宏峡
 * 仓库实现层
 */
@Controller
@RequestMapping("depo")
public class DepotLnController {
    @Resource
    DepotLnServiceImpl imp;

    /**
     * 仓库信息查询
     * @param index
     * @param depotId
     * @param department
     * @param remark
     * @param model
     * @return
     */
    @RequestMapping("doplist")
    public String LnventoryList(@RequestParam(defaultValue="1")int index, String depotId, String department, String remark, Model model) {

        PageUtil<Depot> dopelist =imp.findPage(index,8,depotId,department,remark);
        model.addAttribute("dopelist", dopelist);
        model.addAttribute("depotId",depotId);
        model.addAttribute("department",department);
        model.addAttribute("remark",remark);


        return "storage/DepotLnlist";

    }
}
