package com.csdj.enterprise.controller.produce;
/**
 * 李邦
 * 控制层：集中生产
 */
import com.csdj.enterprise.controller.produce.util.PageUtil;
import com.csdj.enterprise.entity.produce.Productionlb;
import com.csdj.enterprise.service.produce.ProductionlbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;

@Controller
@RequestMapping("Productionlb")
public class ProductionlbController {
    @Resource
    ProductionlbService service;

    @RequestMapping("findSelect")
    public String findSelect(
            @RequestParam(defaultValue="1",required=false)int index,
            @RequestParam(defaultValue="2",required=false)int size,
            @RequestParam(defaultValue="0",required=false) String documentId,
            @RequestParam(defaultValue="0",required=false) String materialsId,
            Model model) {
        PageUtil<Productionlb> pu =service.findSelect(index,size,documentId,materialsId);
        model.addAttribute("pu",pu);
        return "produce/Productionlb";
    }

}
