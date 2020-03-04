package com.csdj.enterprise.controller.interflow;

import com.alibaba.fastjson.JSON;
import com.csdj.enterprise.entity.interflow.information;
import com.csdj.enterprise.service.interflow.InterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/test")
public class InterController {

    @Resource
    private InterService service;

    @RequestMapping("main")
    public String main(){
        return "interflow/Inter";
    }

    @RequestMapping("know")
    public String know(){
        return "interflow/knowledge";
    }

    @RequestMapping("knowges")
    public Object  knowges(Model model,
                          @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
                          @RequestParam(defaultValue="5",value="pageSize")Integer pageSize,String ID,String title){
        System.out.println("这是ID"+ID);
        System.out.println("这是标题"+title);
        //为了程序的严谨性，判断非空：
        if(pageNum == null){
            pageNum = 1;   //设置默认当前页
        }
        if(pageNum <= 0){
            pageNum = 1;
        }
        if(pageSize == null){
            pageSize = 1;    //设置默认每页显示的数据数
        }
        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
        //1.引入分页插件,pageNum是第几页，pageSize是每页显示多少条,默认查询总数count
        PageHelper.startPage(pageNum,pageSize);
        //2.紧跟的查询就是一个分页查询-必须紧跟.后面的其他查询不会被分页，除非再次调用PageHelper.startPage
        try {
            List<information> userList = service.selectKnow(ID,title);
            System.out.println("分页数据："+userList);
            System.out.println(JSON.toJSON(userList));
            model.addAttribute("userList",JSON.toJSON(userList));
            //3.使用PageInfo包装查询后的结果,5是连续显示的条数,结果list类型是Page<E>
            PageInfo<information> pageInfo = new PageInfo<information>(userList,pageSize);
            //4.使用model/map/modelandview等带回前端
            model.addAttribute("pageInfo",pageInfo);
        }finally {
            PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全
        }
        //5.设置返回的jsp/html等前端页面
        // thymeleaf默认就会拼串classpath:/templates/xxxx.html
        return "interflow/knowledge";
    }

    @RequestMapping("addknow")
    public String addknow(){
        return "interflow/add";
    }
    @RequestMapping(value = "addknows", method = RequestMethod.POST, produces = "application/text; charset=utf-8")
    @ResponseBody
    public Object addknows(String ID,String title,String lan,String content){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        information information = new information();
        information.setAttachment(content);
        information.setCreation(dateString);
        information.setFounder("何芳");
        information.setID(ID);
        information.setTitle(title);
        int num=service.addknow(information);
        if(num>0){
            return "true";
        }else{
            return "false";
        }
    }
}
