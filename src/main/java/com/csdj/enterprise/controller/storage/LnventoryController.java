package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Lnventory;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.LnventoryServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 莫宏峡
 * 成本调整实现层
 */
@Controller
@RequestMapping("ln")
public class LnventoryController {
    @Resource
    LnventoryServiceImpl imp;

    /**
     * 成本调整信息查询
     * @param index
     * @param lnventoryId
     * @param lnventoryDate
     * @param Date
     * @param staffId
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String LnventoryList(@RequestParam(defaultValue="1")int index, String lnventoryId,
                                String lnventoryDate, String Date, String staffId, Model model) {

        PageUtil<Lnventory> pu =imp.findPage(index,8,lnventoryId,lnventoryDate,Date,staffId);
        model.addAttribute("lnven", pu);
        model.addAttribute("lnventoryId",lnventoryId);
        model.addAttribute("lnventoryDate",lnventoryDate);
        model.addAttribute("Date",Date);
        model.addAttribute("staffId",staffId);

        return "storage/Lnvetrorylist";

    }
    /**
     * 添加初始页面
     *
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        return "storage/LnvetoryAdd";
    }

    /**
     * 添加保存
     *
     * @param
     * @return 1. 数据验证提交的对象前加注解@Validated,使数据在封装对象时自动进行数据的验证。 2.
     *         BindingResult对象，此对象中封装了验证过程中的错误信息,它只能结合@Validated注解使用
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView add(@Validated Lnventory leavers, Model model) {
        imp.add(leavers);
        // 重定向到: list 这个URL中去。
        return new ModelAndView("redirect:list");
    }

    /**
     * 物料拆迁信息查询
     * @param index
     * @param lnventoryId
     * @param lnventoryDate
     * @param Date
     * @param staffId
     * @param lnventoryBei
     * @param model
     * @return
     */
    @RequestMapping("Delist")
    public String DepotLnventoryList(@RequestParam(defaultValue="1")int index, String lnventoryId,
                                String lnventoryDate, String Date, String staffId,  String lnventoryBei,Model model) {

        PageUtil<Lnventory> pu =imp.DepotfindPage(index,8,lnventoryId,lnventoryDate,Date,staffId,lnventoryBei);
        model.addAttribute("DepotLnven", pu);
        model.addAttribute("lnventoryId",lnventoryId);
        model.addAttribute("lnventoryDate",lnventoryDate);
        model.addAttribute("Date",Date);
        model.addAttribute("staffId",staffId);
        model.addAttribute("lnventoryBei",lnventoryBei);
        return "storage/DepotLnventoryList";

    }
}
