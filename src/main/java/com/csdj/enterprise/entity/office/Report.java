package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  报告表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Report implements Serializable {

    private  int rId;//编号
    private  int rType;//类型【报告类型表】
    private  Date rBeginDate;//开始时间
    private  Date  rFinishDate;//开始时间
    private  String rTitle;//标题
    private  String  rDeyails;//正文
    private  int rDispose;//报告职位【职位表】
    private  int rDispost;//点评职位【职位表】

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getrType() {
        return rType;
    }

    public void setrType(int rType) {
        this.rType = rType;
    }

    public Date getrBeginDate() {
        return rBeginDate;
    }

    public void setrBeginDate(Date rBeginDate) {
        this.rBeginDate = rBeginDate;
    }

    public Date getrFinishDate() {
        return rFinishDate;
    }

    public void setrFinishDate(Date rFinishDate) {
        this.rFinishDate = rFinishDate;
    }

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle;
    }

    public String getrDeyails() {
        return rDeyails;
    }

    public void setrDeyails(String rDeyails) {
        this.rDeyails = rDeyails;
    }

    public int getrDispose() {
        return rDispose;
    }

    public void setrDispose(int rDispose) {
        this.rDispose = rDispose;
    }

    public int getrDispost() {
        return rDispost;
    }

    public void setrDispost(int rDispost) {
        this.rDispost = rDispost;
    }
}
