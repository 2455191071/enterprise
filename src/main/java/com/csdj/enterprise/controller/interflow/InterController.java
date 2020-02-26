package com.csdj.enterprise.controller.interflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterController {

    @RequestMapping("main")
    public String main(){
        return "interflow/Inter";
    }

    @RequestMapping("know")
    public String know(){
        return "interflow/knowledge";
    }
}
