package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/20 15:17
 */

import java.util.Date;

/**
 * @program: enterprise
 *
 * @description: 采购订单表
 *
 * @author: miss陆岳南
 *
 * @create: 2020-02-20 15:17
 **/
public class order {
     private int id;//编号
     private Date create;//日期
     private String supplier;//供应商
    private String linkman;//供应商联系人
    private String phone;//联系电话
    private String warehouse;//仓库
    private String Harvest;//收货调度
    private int payment;//账期(天)
    private String buyer;//采购员
    private String buyerposition;//采购职位
    private Double money;//采购总额
    private Double discounts_money;//优惠金额
    private Double actualamount;//自付实际金额
    private String department;//分摊部门
    private String moneyType;//费用类型
    private Double invoiceMoney;//调整发票金额
    private Double actualMoney;//实际发票金额
    private String remark;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getHarvest() {
        return Harvest;
    }

    public void setHarvest(String harvest) {
        Harvest = harvest;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyerposition() {
        return buyerposition;
    }

    public void setBuyerposition(String buyerposition) {
        this.buyerposition = buyerposition;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getDiscounts_money() {
        return discounts_money;
    }

    public void setDiscounts_money(Double discounts_money) {
        this.discounts_money = discounts_money;
    }

    public Double getActualamount() {
        return actualamount;
    }

    public void setActualamount(Double actualamount) {
        this.actualamount = actualamount;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public Double getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Double invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public Double getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(Double actualMoney) {
        this.actualMoney = actualMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
