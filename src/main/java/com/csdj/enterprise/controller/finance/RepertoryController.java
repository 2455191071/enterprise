package com.csdj.enterprise.controller.finance;

import com.alibaba.fastjson.JSON;
import com.csdj.enterprise.entity.finance.Repertory;
import com.csdj.enterprise.service.finance.RepertoryService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: spring_erp
 * @description: Controller Class
 * @author: Yin jie
 * @create: 2020-02-17 18:48
 **/
@org.springframework.stereotype.Controller
@RequestMapping("repertory")
public class RepertoryController {
    @RequestMapping("addRepertory")
    public String addProvider() {
        return "finance/repertory/addRepertory.html";
    }

    @RequestMapping("upRepertory")
    public String upProvider() {
        return "finance/repertory/upRepertory.html";
    }
    @Resource
    private RepertoryService repertoryService;
    @RequestMapping("selectRepertory")
    public String selectRepertory() {

        return "/finance/repertory/selectRepertory.html";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    /**
     * 查询
     *
     * @param warehouse
     * @param currPage
     * @param pageSize
     * @return
     */
    @RequestMapping("findAllByName")
    @ResponseBody
    public Object findAllByName(
            @RequestParam(value = "warehouse", required = false) String warehouse,
            @RequestParam(value = "commodity", required = false) String commodity,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "date", required = false) Date date,
            @RequestParam(value = "page", required = false) Integer currPage,
            @RequestParam(value = "limit", required = false) Integer pageSize) {
        System.out.print("进入查询方法...");
        //如果当前页为空，则默认为第1页
        if (currPage == null) {
            currPage = 1;
        }
        //如果每页条数为空，则默认为每页10条
        if (pageSize == null) {
            pageSize = 10;
        }
        //计算出从哪一条开始显示
        int limitOne = (currPage - 1) * pageSize;
        //记录集合
        List<Repertory> list = repertoryService.findByAll(warehouse,commodity,remarks,date, limitOne, pageSize);
        //总条数
        int count = repertoryService.findTypeNameCount(warehouse);
        System.out.println("记录数：" + count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strJson + "}";
        System.out.println(json);
        return json;
    }


    /**
     * 删除
     * @param warehouseId
     * @return
     */
    @RequestMapping("del")
    @ResponseBody
    public Object del(@RequestParam(value = "warehouseId", required = false) Integer warehouseId) {//删除信息
        int count = repertoryService.delById(warehouseId);
        return count;
    }

    /**
     * 增加
     * @param repertory
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public Object add(Repertory repertory) {
        int count = repertoryService.add(repertory);
        System.out.println(repertory);
        return count;
    }

    /**
     * 修改
     * @param repertory
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public Object update(Repertory repertory) {
        int count = repertoryService.update(repertory);
        return count;
    }

    /**
     * 通过id查询
     * @param warehouseId
     * @return
     */
    @RequestMapping("findById")
    @ResponseBody
    public Object findById(@RequestParam(value = "warehouseId", required = false) Integer warehouseId) {//根据ID查询数据
        Repertory obj = repertoryService.findById(warehouseId);
        return JSON.toJSON(obj);
    }
}
