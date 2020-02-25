package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 外协表
 */
public class OutSource {
    private String oId; //编号
    private String outsourceId; //外协编号
    private String product; //产品
    private Date odate; //日期
    private String supplierId; //供应商编号
    private String outsourcingpart; //外协员
    private String outsourcePost; //外协职位
    private int quantity; //数量
    private String processPrice; //加工单价
    private String money; //金额
    private String useCost; //用料成本
    private String transportation; //MRP运输编号
    private String auditState; //审核状态
    private String accountpaid; //已付款
    private String obligation; //待付款
    private String establishedOrder; //已制订单

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getOutsourceId() {
        return outsourceId;
    }

    public void setOutsourceId(String outsourceId) {
        this.outsourceId = outsourceId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getOutsourcingpart() {
        return outsourcingpart;
    }

    public void setOutsourcingpart(String outsourcingpart) {
        this.outsourcingpart = outsourcingpart;
    }

    public String getOutsourcePost() {
        return outsourcePost;
    }

    public void setOutsourcePost(String outsourcePost) {
        this.outsourcePost = outsourcePost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProcessPrice() {
        return processPrice;
    }

    public void setProcessPrice(String processPrice) {
        this.processPrice = processPrice;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getUseCost() {
        return useCost;
    }

    public void setUseCost(String useCost) {
        this.useCost = useCost;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAccountpaid() {
        return accountpaid;
    }

    public void setAccountpaid(String accountpaid) {
        this.accountpaid = accountpaid;
    }

    public String getObligation() {
        return obligation;
    }

    public void setObligation(String obligation) {
        this.obligation = obligation;
    }

    public String getEstablishedOrder() {
        return establishedOrder;
    }

    public void setEstablishedOrder(String establishedOrder) {
        this.establishedOrder = establishedOrder;
    }
}
