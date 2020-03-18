package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Bomlb;
import com.csdj.enterprise.service.produce.BomlbService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("Bomlb")
public class BomlbController {
    @Resource
    BomlbService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) String materialsId,
            @RequestParam(defaultValue="0",required=false) String warehouseId,
            Model model) {
        PageUtil<Bomlb> pu =service.findSelect(index,size,materialsId,warehouseId);
        model.addAttribute("pu",pu);
        return "produce/Bomlb";
    }

    @RequestMapping(value="findInsert", method = RequestMethod.GET)
    public String findInsert(){
        return "produce/BomlbInsert";
    }

    @RequestMapping(value="findInsert", method = RequestMethod.POST)
    public String findInsert(Bomlb b){
        service.findInsert(b);
        return "redirect:findSelect";
    }

    @RequestMapping("bomIdSelect")
    public String bomIdSelect(String bomId,Model model){
        Bomlb bomlb=service.bomIdSelect(bomId);
        model.addAttribute("bomlb",bomlb);
        return "produce/bomIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String bomId,Model model){
        Bomlb bomlb=service.bomIdSelect(bomId);
        model.addAttribute("bomlb",bomlb);
        return "produce/BomlbUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Bomlb b){
        service.findUpdate(id,b);
        return "redirect:findSelect";
    }



    @RequestMapping("bomIdDelete")
    public String bomIdDelete(String bomId){
        service.bomIdDelete(bomId);
        return "redirect:findSelect";
    }
}
