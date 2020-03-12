package com.csdj.enterprise.controller.finance;

import com.alibaba.fastjson.JSON;
import com.csdj.enterprise.entity.finance.ApplyDepartment;
import com.csdj.enterprise.entity.finance.CostType;
import com.csdj.enterprise.entity.finance.PersonApply;
import com.csdj.enterprise.service.finance.PersonApplyService;
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
 * @create: 2020-02-18 12:52
 **/
@org.springframework.stereotype.Controller
@RequestMapping("apply")
public class PersonApplyController {
    @Resource
    private PersonApplyService personApplyService;

    @RequestMapping("selectPersonApply")
    public String selectPersonApply() {

        return "finance/person_apply/selectPersonApply.html";
    }
    @RequestMapping("addPersonApply")
    public String addProvider() {
        return "finance/person_apply/addPersonApply.html";
    }

    @RequestMapping("upPersonApply")
    public String upProvider() {
        return "finance/person_apply/upPersonApply.html";
    }

    @RequestMapping("findDepartment")
    @ResponseBody
    public Object findDepartment() { //查询部门信息
        List<ApplyDepartment> list = personApplyService.findDepartment();
        return JSON.toJSON(list);
    }

    @RequestMapping("findCostType")
    @ResponseBody
    public Object findCostType() { //查询类型信息
        List<CostType> list = personApplyService.findCostType();
        return JSON.toJSON(list);
    }

    @RequestMapping("findPost")
    @ResponseBody
    public Object findPost() { //查询过账信息
        List<PersonApply> list = personApplyService.findPost();
        return JSON.toJSON(list);
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
     * @param typeId
     * @param currPage
     * @param pageSize
     * @return
     */
    @RequestMapping("findAllByName")
    @ResponseBody
    public Object findAllByName(
            @RequestParam(value = "typeId", required = false) Integer typeId,
            @RequestParam(value = "applyDepartmentId", required = false) Integer applyDepartmentId,
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
        List<PersonApply> list = personApplyService.findpInfoName(typeId,applyDepartmentId,begindate,paydate, limitOne, pageSize);
        //总条数
        int count = personApplyService.findTypeNameCount();
        System.out.println("记录数：" + count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strJson + "}";
        System.out.println(json);
        return json;
    }
    /**
     * 增加
     * @param personApply
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public Object add(PersonApply personApply) {
        int count = personApplyService.add(personApply);
        System.out.println(personApply);
        return count;
    }
    /**
     * 修改
     * @param personApply
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public Object update(PersonApply personApply) {
        int count = personApplyService.update(personApply);
        return count;
    }

    /**
     * 通过id查询
     * @param applyId
     * @return
     */
    @RequestMapping("findById")
    @ResponseBody
    public Object findById(@RequestParam(value = "applyId", required = false) Integer applyId) {//根据ID查询数据
        PersonApply obj = personApplyService.findById(applyId);
        return JSON.toJSON(obj);
    }

    /**
     * 删除
     * @param applyId
     * @return
     */
    @RequestMapping("del")
    @ResponseBody
    public Object del(@RequestParam(value = "applyId", required = false) Integer applyId) {//删除信息
        int count = personApplyService.delById(applyId);
        return count;
    }
}
