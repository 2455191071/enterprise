package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/20 15:29
 */

/**
 * @program: enterprise
 *
 * @description: 列表项目类型
 *
 * @author: miss陆岳南
 *
 * @create: 2020-02-20 15:29
 **/
public class Template {
    private int tid;//类型编号
    private String name;//类型名称
    private String  local_template;//本机模板
    private String templateNum;//合并模板数;
    private String order;//调整顺序
    private String subsevel;//新增子级;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal_template() {
        return local_template;
    }

    public void setLocal_template(String local_template) {
        this.local_template = local_template;
    }

    public String getTemplateNum() {
        return templateNum;
    }

    public void setTemplateNum(String templateNum) {
        this.templateNum = templateNum;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSubsevel() {
        return subsevel;
    }

    public void setSubsevel(String subsevel) {
        this.subsevel = subsevel;
    }
}
