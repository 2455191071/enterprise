package com.csdj.enterprise.entity.finance;

/**
 * 客户退款表
 */
public class CustomerRefund {
    private String  Id;//编号
    private String deadline;//退款期限
    private String client;//客户
    private double shouldBack;//核销应退额
    private double advanceRefund;//预收退款额
    private double collectingRealBack;//代收实退额
    private double realBack;//实退金额
    private double paid;//出纳已付
    private String accountingDate;//记账日期
    private String salesman;//业务员
    private String prepared;//制单人
    private String remark;//备注

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getShouldBack() {
        return shouldBack;
    }

    public void setShouldBack(double shouldBack) {
        this.shouldBack = shouldBack;
    }

    public double getAdvanceRefund() {
        return advanceRefund;
    }

    public void setAdvanceRefund(double advanceRefund) {
        this.advanceRefund = advanceRefund;
    }

    public double getCollectingRealBack() {
        return collectingRealBack;
    }

    public void setCollectingRealBack(double collectingRealBack) {
        this.collectingRealBack = collectingRealBack;
    }

    public double getRealBack() {
        return realBack;
    }

    public void setRealBack(double realBack) {
        this.realBack = realBack;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
