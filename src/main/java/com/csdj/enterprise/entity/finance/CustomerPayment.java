package com.csdj.enterprise.entity.finance;

/**
 * 客户收款表
 */
public class CustomerPayment {
    private String Id;//编号
    private String client;//客户
    private String deadline;//收款期限
    private String salesman;//业务员
    private double total;//收款账户合计
    private double serviceCharge;//手续费
    private double discounts;//应收优惠
    private double crop;//核销应收额
    private double collection;//核销代收额
    private String makingTime;//制单时间
    private String prepared;//制单人

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    public double getCrop() {
        return crop;
    }

    public void setCrop(double crop) {
        this.crop = crop;
    }

    public double getCollection() {
        return collection;
    }

    public void setCollection(double collection) {
        this.collection = collection;
    }

    public String getMakingTime() {
        return makingTime;
    }

    public void setMakingTime(String makingTime) {
        this.makingTime = makingTime;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared;
    }
}
