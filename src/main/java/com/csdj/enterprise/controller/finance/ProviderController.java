package com.csdj.enterprise.controller.finance;

import com.alibaba.fastjson.JSON;
import com.csdj.enterprise.entity.finance.Provider;
import com.csdj.enterprise.service.finance.ProviderService;
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
 * @create: 2020-02-10 15:13
 **/
@org.springframework.stereotype.Controller
@RequestMapping("kirb")
public class ProviderController {

    @Resource
    private ProviderService providerService;

    @RequestMapping("selectProvider")
    public String getSelectProvider() {
        return "finance/provider_begin/selectProvider.html";
    }

    @RequestMapping("addProvider")
    public String addProvider() {
        return "finance/provider_begin/addProvider.html";
    }

    @RequestMapping("upProvider")
    public String upProvider() {
        return "finance/provider_begin/upProvider.html";
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
     * @param provider
     * @param currPage
     * @param pageSize
     * @return
     */
    @RequestMapping("findAllByName")
    @ResponseBody
    public Object findAllByName(
            @RequestParam(value = "provider", required = false) String provider,
            @RequestParam(value = "begindate", required = false) Date begindate,
            @RequestParam(value = "paydate", required = false) Date paydate,
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
        List<Provider> list = providerService.findpInfoName(provider,begindate,paydate, limitOne, pageSize);
        //总条数
        int count = providerService.findTypeNameCount(provider);
        System.out.println("记录数：" + count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strJson + "}";
        System.out.println(json);
        return json;
    }
    /**
     * 增加
     * @param provider
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public Object add(Provider provider) {
        int count = providerService.add(provider);
        System.out.println(provider);
        return count;
    }
    /**
     * 修改
     * @param provider
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public Object update(Provider provider) {
        int count = providerService.update(provider);
        return count;
    }

    /**
     * 通过id查询
     * @param providerId
     * @return
     */
    @RequestMapping("findById")
    @ResponseBody
    public Object findById(@RequestParam(value = "providerId", required = false) Integer providerId) {//根据ID查询数据
        Provider obj = providerService.findById(providerId);
        return JSON.toJSON(obj);
    }

    /**
     * 删除
     * @param providerId
     * @return
     */
    @RequestMapping("del")
    @ResponseBody
    public Object del(@RequestParam(value = "providerId", required = false) Integer providerId) {//删除信息
        int count = providerService.delById(providerId);
        return count;
    }




}
