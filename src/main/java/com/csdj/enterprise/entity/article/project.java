package com.csdj.enterprise.entity.article;

import java.util.Date;

/**
 * 陆岳南
 * 实体类:项目表
 */
public class project {
    private  int pId ; //项目编号
    private  String pName;//项目名称
    private String pType;//项目类型
    private String ptempLate;//初始模板
    private String pwareHouse;//默认仓库
    private  String content;//内容
    private Date startDate;//开始时间
    private Date endDate;//结束时间
    private String principal;//负责人
    private String particpant;//参与人
    private String position;//负责职位
    private String client;//客户
    private String plinkman;//客户联系人
    private String salesman;//业务员

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getPtempLate() {
        return ptempLate;
    }

    public void setPtempLate(String ptempLate) {
        this.ptempLate = ptempLate;
    }

    public String getPwareHouse() {
        return pwareHouse;
    }

    public void setPwareHouse(String pwareHouse) {
        this.pwareHouse = pwareHouse;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getParticpant() {
        return particpant;
    }

    public void setParticpant(String particpant) {
        this.particpant = particpant;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPlinkman() {
        return plinkman;
    }

    public void setPlinkman(String plinkman) {
        this.plinkman = plinkman;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    private String post;//业务职位


}
