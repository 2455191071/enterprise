package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Overview;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.OverviewServiceImpl;
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
 * K库存总览实现层
 */
@Controller
@RequestMapping("over")
public class OverviewController {
    @Resource
    OverviewServiceImpl imp;

    /**
     * 库存总览
     * @param index
     * @param commodityId
     * @param wareId
     * @param model
     * @return
     */
    @RequestMapping("ovlist")
    public String OverviewList(@RequestParam(defaultValue="1")int index, String commodityId, String wareId, Model model) {

        PageUtil<Overview> over =imp.findPage(index,8,commodityId,wareId);
        model.addAttribute("overlist", over);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("wareId",wareId);


        return "storage/Overviewlist";

    }

    /**
     * 期初管理查询
     * @param index
     * @param commodityId
     * @param wareId
     * @param model
     * @return
     */
    @RequestMapping("ovlistqc")
    public String OverviewListqc(@RequestParam(defaultValue="1")int index, String commodityId, String wareId, Model model) {

        PageUtil<Overview> pu =imp.findPage(index,8,commodityId,wareId);
        model.addAttribute("lnven", pu);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("wareId",wareId);


        return "storage/OvervChuqi";

    }

    /**
     * 添加初始页面
     *
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        return "storage/OverviewAdd";
    }

    /**
     * 添加保存
     *
     * @param
     * @return 1. 数据验证提交的对象前加注解@Validated,使数据在封装对象时自动进行数据的验证。 2.
     *         BindingResult对象，此对象中封装了验证过程中的错误信息,它只能结合@Validated注解使用
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView add(@Validated Overview overview, Model model) {
        imp.add(overview);
        // 重定向到: list 这个URL中去。
        return new ModelAndView("redirect:ovlistqc");
    }

    /**
     * 库存上下限查询
     * @param index
     * @param commodityId
     * @param wareId
     * @param model
     * @return
     */
    @RequestMapping("ovlistStup")
    public String ovlistStup(@RequestParam(defaultValue="1")int index, String commodityId, String wareId, Model model) {

        PageUtil<Overview> ovlistStup =imp.findPage(index,8,commodityId,wareId);
        model.addAttribute("ovlistStup", ovlistStup);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("wareId",wareId);


        return "storage/OvervSetup";

    }
}
