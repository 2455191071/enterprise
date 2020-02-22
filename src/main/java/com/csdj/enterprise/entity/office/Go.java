package com.csdj.enterprise.entity.office;


import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  人员去向表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Go implements Serializable {
    private  int gId;//编号
    private  int gName;//职员 【员工表】
    private  String gText;//备注
    private  String gGoing; //去向
    private  Date gBeginDate;//开始时间
    private  Date gFinishDate;//结束时间
    private  Date gUpDate;// 更新时间

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getgName() {
        return gName;
    }

    public void setgName(int gName) {
        this.gName = gName;
    }

    public String getgText() {
        return gText;
    }

    public void setgText(String gText) {
        this.gText = gText;
    }

    public String getgGoing() {
        return gGoing;
    }

    public void setgGoing(String gGoing) {
        this.gGoing = gGoing;
    }

    public Date getgBeginDate() {
        return gBeginDate;
    }

    public void setgBeginDate(Date gBeginDate) {
        this.gBeginDate = gBeginDate;
    }

    public Date getgFinishDate() {
        return gFinishDate;
    }

    public void setgFinishDate(Date gFinishDate) {
        this.gFinishDate = gFinishDate;
    }

    public Date getgUpDate() {
        return gUpDate;
    }

    public void setgUpDate(Date gUpDate) {
        this.gUpDate = gUpDate;
    }
}
