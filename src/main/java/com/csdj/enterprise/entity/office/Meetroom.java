package com.csdj.enterprise.entity.office;


import java.io.Serializable;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  会议表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Meetroom implements Serializable {
   private int iId;  //编号
   private String  iName; //会议室名称
   private int iNum;  //容纳人数
   private String iText; //简介

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public int getiNum() {
        return iNum;
    }

    public void setiNum(int iNum) {
        this.iNum = iNum;
    }

    public String getiText() {
        return iText;
    }

    public void setiText(String iText) {
        this.iText = iText;
    }
}
