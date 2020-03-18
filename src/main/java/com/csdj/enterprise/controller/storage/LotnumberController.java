package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Lotnumber;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.LotnumberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
        * 莫宏峡
        * 批号库存管理表实现层
        */
@Controller
@RequestMapping("lo")
public class LotnumberController {
    @Resource
    LotnumberServiceImpl imp;

    /**
     * 批号库存管理信息查询
     * @param index
     * @param commodityId
     * @param lotnumberId
     * @param model
     * @return
     */
    @RequestMapping("lolist")
    public String LotnumberList(@RequestParam(defaultValue="1")int index, String commodityId, String lotnumberId, Model model) {

        PageUtil<Lotnumber> pu =imp.findPage(index,8,commodityId,lotnumberId);
        model.addAttribute("lotn", pu);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("lotnumberId",lotnumberId);


        return "storage/Lotnumberlist";

    }

}
