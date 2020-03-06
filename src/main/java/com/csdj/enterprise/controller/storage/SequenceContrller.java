package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.entity.storage.Sequence;
import com.csdj.enterprise.service.impl.storage.SequenceServiceImpl;
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
 * 商品序列号管理实现层
 */
@Controller
@RequestMapping("se")
public class SequenceContrller {
    @Resource
    SequenceServiceImpl imp;

    /**
     * 商品序列号管理信息查询
     * @param index
     * @param commodityId
     * @param sequenceId
     * @param memberId
     * @param sequenceBei
     * @param model
     * @return
     */
    @RequestMapping("sequlist")
    public String SequenceList(@RequestParam(defaultValue="1")int index, String commodityId, String sequenceId, String memberId, String sequenceBei, Model model) {

        PageUtil<Sequence> sequenlist =imp.findPage(index,8,commodityId,sequenceId,memberId,sequenceBei);
        model.addAttribute("sequenlist", sequenlist);
        model.addAttribute("commodityId",commodityId);
        model.addAttribute("sequenceId",sequenceId);
        model.addAttribute("memberId",memberId);
        model.addAttribute("sequenceBei",sequenceBei);

        return "storage/Sequencelist";

    }
    /**
     * 添加初始页面
     *
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add() {
        return "storage/SequenceAdd";
    }

    /**
     * 添加保存
     *
     * @param
     * @return 1. 数据验证提交的对象前加注解@Validated,使数据在封装对象时自动进行数据的验证。 2.
     *         BindingResult对象，此对象中封装了验证过程中的错误信息,它只能结合@Validated注解使用
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView add(@Validated Sequence leavers, Model model) {
        imp.add(leavers);
        // 重定向到: list 这个URL中去。
        return new ModelAndView("redirect:sequlist");
    }
}
