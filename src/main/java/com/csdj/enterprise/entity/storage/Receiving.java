package com.csdj.enterprise.entity.storage;

/**
 * 曾雅思   收货明细表
 */
public class Receiving {
    private String recevId;         //明细编号
    private String recevDate;      //日期
    private String invoices;       //所属单据
    private String depotId;        //仓库编号
    private String clientId;      //客户编号
    private String suppliesId;    //商品物料编号
    private int fanumber;       //收货数量
    private int money;         //金额
    private int cost;          //成本
    private String batchnumber; //批号
    private String post;        //过账
    private String remark;      //备注

    public String getRecevId() {
        return recevId;
    }

    public void setRecevId(String recevId) {
        this.recevId = recevId;
    }

    public String getRecevDate() {
        return recevDate;
    }

    public void setRecevDate(String recevDate) {
        this.recevDate = recevDate;
    }

    public String getInvoices() {
        return invoices;
    }

    public void setInvoices(String invoices) {
        this.invoices = invoices;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSuppliesId() {
        return suppliesId;
    }

    public void setSuppliesId(String suppliesId) {
        this.suppliesId = suppliesId;
    }

    public int getFanumber() {
        return fanumber;
    }

    public void setFanumber(int fanumber) {
        this.fanumber = fanumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
