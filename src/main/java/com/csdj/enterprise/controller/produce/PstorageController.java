package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Pstorage;
import com.csdj.enterprise.service.produce.PstorageService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("Pstorage")
public class PstorageController {
    @Resource
    PstorageService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) String warehouseId,
            @RequestParam(defaultValue="0",required=false) String planId,
            Model model) {
        PageUtil<Pstorage> pu =service.findSelect(index,size,warehouseId,planId);
        model.addAttribute("pu",pu);
        return "produce/Pstorage";
    }

    @RequestMapping("pstorageIdSelect")
    public String pstorageIdSelect(String pstorageId,Model model){
        Pstorage pstorage=service.pstorageIdSelect(pstorageId);
        model.addAttribute("pstorage",pstorage);
        return "produce/pstorageIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String pstorageId,Model model){
        Pstorage pstorage=service.pstorageIdSelect(pstorageId);
        model.addAttribute("pstorage",pstorage);
        return "produce/PstorageUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Pstorage p){
        service.findUpdate(id,p);
        return "redirect:findSelect";
    }


    @RequestMapping("pstorageIdDelete")
    public String pstorageIdDelete(String pstorageId){
        service.pstorageIdDelete(pstorageId);
        return "redirect:findSelect";
    }
}
