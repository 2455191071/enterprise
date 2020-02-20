package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  人员在线表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Line  implements Serializable{
     private  int lId;//编号
     private  int lName;//人员 【员工表】
     private  Date lOnDate;//起始时间
     private  Date lAtDate;//最近时间
     private  String lLogIn;//登录IP
     private  String lState;//在线状态
     private  String lText;//在线状态备注
     private  String lMedium;//媒介

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public int getlName() {
        return lName;
    }

    public void setlName(int lName) {
        this.lName = lName;
    }

    public Date getlOnDate() {
        return lOnDate;
    }

    public void setlOnDate(Date lOnDate) {
        this.lOnDate = lOnDate;
    }

    public Date getlAtDate() {
        return lAtDate;
    }

    public void setlAtDate(Date lAtDate) {
        this.lAtDate = lAtDate;
    }

    public String getlLogIn() {
        return lLogIn;
    }

    public void setlLogIn(String lLogIn) {
        this.lLogIn = lLogIn;
    }

    public String getlState() {
        return lState;
    }

    public void setlState(String lState) {
        this.lState = lState;
    }

    public String getlText() {
        return lText;
    }

    public void setlText(String lText) {
        this.lText = lText;
    }

    public String getlMedium() {
        return lMedium;
    }

    public void setlMedium(String lMedium) {
        this.lMedium = lMedium;
    }
}
