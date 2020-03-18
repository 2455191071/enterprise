package com.csdj.enterprise.controller.produce;

import com.csdj.enterprise.entity.produce.Plan;
import com.csdj.enterprise.service.produce.PlanService;
import com.csdj.enterprise.controller.produce.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("Plan")
public class PlanController {
    @Resource
    PlanService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) String productId,
            Model model) {
        PageUtil<Plan> pu =service.findSelect(index,size,productId);
        model.addAttribute("pu",pu);
        return "produce/Plan";
    }

    @RequestMapping(value="findInsert", method = RequestMethod.GET)
    public String findInsert(){
        return "produce/PlanInsert";
    }

    @RequestMapping(value="findInsert", method = RequestMethod.POST)
    public String findInsert(Plan p){
        service.findPostInsert(p);
        return "redirect:findSelect";
    }

    @RequestMapping("planIdSelect")
    public String planIdSelect(String planId,Model model){
        Plan plan=service.planIdSelect(planId);
        model.addAttribute("plan",plan);
        return "produce/planIdSelect";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.GET)
    public String findUpdate(String planId,Model model){
        Plan plan=service.planIdSelect(planId);
        model.addAttribute("plan",plan);
        return "produce/PlanUpdate";
    }

    @RequestMapping(value="findUpdate", method = RequestMethod.POST)
    public String findUpdate(String id,Plan p){
        service.findUpdate(id,p);
        return "redirect:findSelect";
    }



    @RequestMapping("planIdDelete")
    public String planIdDelete(String planId){
        service.planIdDelete(planId);
        return "redirect:findSelect";
    }
}
