package com.csdj.enterprise.entity.interflow;

public class library {
    private int Wid;//网址编号
    private String name;    //名称
    private String classification;//分类
    private String dz;  //访问地址
    private String Introduction;//简介

    public int getWid() {
        return Wid;
    }

    public void setWid(int wid) {
        Wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }
}
