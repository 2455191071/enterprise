package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Morder;
import com.csdj.enterprise.service.produce.MorderService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("Morder")
public class MorderController {
    @Resource
    MorderService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) int mrp,
            @RequestParam(defaultValue="0",required=false) String productId,
            Model model) {
        PageUtil<Morder> pu =service.findSelect(index,size,mrp,productId);
        model.addAttribute("pu",pu);
        return "produce/Morder";
    }

    @RequestMapping("morderIdSelect")
    public String morderIdSelect(String morderId,Model model){
        Morder morder=service.morderIdSelect(morderId);
        model.addAttribute("morder",morder);
        return "produce/morderIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String morderId,Model model){
        Morder morder=service.morderIdSelect(morderId);
        model.addAttribute("morder",morder);
        return "produce/MorderUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Morder m){
        service.findUpdate(id,m);
        return "redirect:findSelect";
    }


    @RequestMapping("morderIdDelete")
    public String morderIdDelete(String morderId){
        service.morderIdDelete(morderId);
        return "redirect:findSelect";
    }
}
