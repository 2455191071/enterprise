package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Outsourcing;
import com.csdj.enterprise.service.produce.OutsourcingService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("Outsourcing")
public class OutsourcingController {
    @Resource
    OutsourcingService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) int outsourcerId,
            @RequestParam(defaultValue="0",required=false) String supplierId,
            @RequestParam(defaultValue="0",required=false) String contactId,
            Model model) {
        PageUtil<Outsourcing> pu =service.findSelect(index,size,supplierId,contactId,outsourcerId);
        model.addAttribute("pu",pu);
        return "produce/Outsourcing";
    }

    @RequestMapping("outsourcingIdSelect")
    public String outsourcingIdSelect(String outsourcingId,Model model){
        Outsourcing outsourcing=service.outsourcingIdSelect(outsourcingId);
        model.addAttribute("outsourcing",outsourcing);
        return "produce/outsourcingIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String outsourcingId,Model model){
        Outsourcing outsourcing=service.outsourcingIdSelect(outsourcingId);
        model.addAttribute("outsourcing",outsourcing);
        return "produce/OutsourcingUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Outsourcing o){
        service.findUpdate(id,o);
        return "redirect:findSelect";
    }


    @RequestMapping("outsourcingIdDelete")
    public String outsourcingIdDelete(String outsourcingId){
        service.outsourcingIdDelete(outsourcingId);
        return "redirect:findSelect";
    }
}
