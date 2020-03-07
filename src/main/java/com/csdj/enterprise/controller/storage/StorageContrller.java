package com.csdj.enterprise.controller.storage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 莫宏峡
 * 首页
 */
@Controller
public class StorageContrller {

    @RequestMapping("index")
    public String main(){
        return "storage/Storage";
    }

/*    @RequestMapping("index2")
    public String main2(){
        return "storage/index";
    }*/

}
