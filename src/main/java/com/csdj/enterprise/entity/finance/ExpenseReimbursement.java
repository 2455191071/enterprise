package com.csdj.enterprise.entity.finance;

/**
 * 费用报销类
 */
public class ExpenseReimbursement {
    private String Id;	//编号
    private String reason;//报销事由
    private String applicationDate;//申请日期
    private String accountingDate;//记账日期
    private String reimbursement;//报销人
    private double appliedAmount;//申请报销金额
    private double actualAmount;//实际报销金额
    private String prepared;//制单人

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(String reimbursement) {
        this.reimbursement = reimbursement;
    }

    public double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(double appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getPrepared() {
        return prepared;
    }

    public void setPrepared(String prepared) {
        this.prepared = prepared;
    }
}
