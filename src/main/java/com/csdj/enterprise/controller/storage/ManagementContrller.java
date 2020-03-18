package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Management;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.ManagementServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 莫宏峡
 * 库存流水管理实现层
 */
@Controller
@RequestMapping("man")
public class ManagementContrller {
    @Resource
    ManagementServiceImpl imp;

    /**
     * 库存流水管理信息查询
     * @param index
     * @param commodityId
     * @param managementDate
     * @param Date
     * @param wareId
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String  ManagementList(@RequestParam(defaultValue="1")int index,String commodityId, String managementDate, String Date, String wareId, Model model) {

        PageUtil<Management> manlist =imp.findPage(index,8,commodityId,managementDate,Date,wareId);
        model.addAttribute("manlist", manlist);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("managementDate",managementDate);
        model.addAttribute("Date",Date);
        model.addAttribute("wareId",wareId);

        return "storage/Managementlist";

    }
}
