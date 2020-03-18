package com.csdj.enterprise.controller.storage;

import com.csdj.enterprise.entity.storage.Member;
import com.csdj.enterprise.entity.storage.PageUtil;
import com.csdj.enterprise.service.impl.storage.ManagementServiceImpl;
import com.csdj.enterprise.service.impl.storage.MemberServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * 莫宏峡
 * 会员信息实现层
 */
@Controller
@RequestMapping("member")
public class MemberController {
    @Resource
    MemberServiceImpl imp;

    /**
     * 会员信息查询
     * @param index
     * @param memberId
     * @param memberName
     * @param memberPhone
     * @param model
     * @return
     */
    @RequestMapping("memberlist")
    public String LnventoryList(@RequestParam(defaultValue="1")int index, String memberId, String memberName, String memberPhone, Model model) {

        PageUtil<Member> list =imp.findPage(index,8,memberId,memberName,memberPhone);
        model.addAttribute("memberlist", list);
        model.addAttribute("memberId",memberId);
        model.addAttribute("memberName",memberName);
        model.addAttribute("memberPhone",memberPhone);


        return "storage/Memberlist";

    }
}
