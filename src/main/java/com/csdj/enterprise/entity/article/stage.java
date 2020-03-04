package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/19 16:01
 */

/**
 * @program: enterprise
 *
 * @description: 阶段表
 *
 * @author: 陆岳南
 *
 * @create: 2020-02-19 16:01
 **/
public class stage {
     private int sId;//负责人id
     private String sname;//负责人
     private int maintenance;//维修部检测
     private int drawing;//ID图纸
     private int value;//阀门试压
     private int survey;//勘测
     private int total;//合计

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getDrawing() {
        return drawing;
    }

    public void setDrawing(int drawing) {
        this.drawing = drawing;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSurvey() {
        return survey;
    }

    public void setSurvey(int survey) {
        this.survey = survey;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
