package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 生产表
 */
public class ProductionLdn {
    private String pId; //生产编号
    private Date orderDate; //下单日期
    private String sellId; //销售编号
    private String commodityId; //商品编号
    private String bomId; //物料清单编号
    private int quantity; //数量
    private int selfcontrol; //自制入库数
    private int outsource; //外协入库数
    private int stay; //待入库数
    private String stock; //备料期限
    private Date requireDate; //要求日期
    private String planner; //计划人
    private String planpost; //计划职位
    private String plansection; //计划部门

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSelfcontrol() {
        return selfcontrol;
    }

    public void setSelfcontrol(int selfcontrol) {
        this.selfcontrol = selfcontrol;
    }

    public int getOutsource() {
        return outsource;
    }

    public void setOutsource(int outsource) {
        this.outsource = outsource;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Date getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(Date requireDate) {
        this.requireDate = requireDate;
    }

    public String getPlanner() {
        return planner;
    }

    public void setPlanner(String planner) {
        this.planner = planner;
    }

    public String getPlanpost() {
        return planpost;
    }

    public void setPlanpost(String planpost) {
        this.planpost = planpost;
    }

    public String getPlansection() {
        return plansection;
    }

    public void setPlansection(String plansection) {
        this.plansection = plansection;
    }
}
