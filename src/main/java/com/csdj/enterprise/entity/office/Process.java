package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  流程表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Process implements Serializable {

      private  int cId;//编号
      private  int cModule;//流程模块【模块表】
      private  String cTheme;//主题
      private  int    cName; //发起人【员工表】
      private Date  cDate;//发起时间
      private String  cTime;//耗时
      private  String  cState;//状态

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getcModule() {
        return cModule;
    }

    public void setcModule(int cModule) {
        this.cModule = cModule;
    }

    public String getcTheme() {
        return cTheme;
    }

    public void setcTheme(String cTheme) {
        this.cTheme = cTheme;
    }

    public int getcName() {
        return cName;
    }

    public void setcName(int cName) {
        this.cName = cName;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState;
    }
}
