package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Ostorage;
import com.csdj.enterprise.service.produce.OstorageService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
@Controller
@RequestMapping("Ostorage")
public class OstorageController {
    @Resource
    OstorageService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) String ostorageId,
            @RequestParam(defaultValue="0",required=false) String productId,
            @RequestParam(defaultValue="0",required=false) String warehouseId,
            Model model) {
        PageUtil<Ostorage> pu =service.findSelect(index,size,ostorageId,productId,warehouseId);
        model.addAttribute("pu",pu);
        return "produce/Ostorage";
    }

    @RequestMapping("ostorageIdSelect")
    public String ostorageIdSelect(String ostorageId,Model model){
        Ostorage ostorage=service.ostorageIdSelect(ostorageId);
        model.addAttribute("ostorage",ostorage);
        return "produce/ostorageIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String ostorageId,Model model){
        Ostorage ostorage=service.ostorageIdSelect(ostorageId);
        model.addAttribute("ostorage",ostorage);
        return "produce/ostorageIdUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Ostorage o){
        service.findUpdate(id,o);
        return "redirect:findSelect";
    }


    @RequestMapping("ostorageIdDelete")
    public String ostorageIdDelete(String ostorageId){
        service.ostorageIdDelete(ostorageId);
        return "redirect:findSelect";
    }
}
