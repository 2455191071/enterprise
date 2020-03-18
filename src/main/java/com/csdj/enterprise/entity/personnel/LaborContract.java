package com.csdj.enterprise.entity.personnel;

/**
 * 劳动合同类
 */
public class LaborContract {
    private String Id;	//编号
    private String contractType;//合同类型
    private String officeClerk;//职员
    private String departmentStaff;//职员部门
    private String startDate;//起始日期
    private String endingDate;//结束日期
    private String  maturityDate;//到期日期
    private String trialDate;//试用期限
    private String operator;//经办人
    private String dateOfSigning;//签订日期
    private int number;//次数
    private String changeDate;//最近变更时间
    private int changenumber;//变更次数
    private String clerkName;

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getOfficeClerk() {
        return officeClerk;
    }

    public void setOfficeClerk(String officeClerk) {
        this.officeClerk = officeClerk;
    }

    public String getDepartmentStaff() {
        return departmentStaff;
    }

    public void setDepartmentStaff(String departmentStaff) {
        this.departmentStaff = departmentStaff;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getTrialDate() {
        return trialDate;
    }

    public void setTrialDate(String trialDate) {
        this.trialDate = trialDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDateOfSigning() {
        return dateOfSigning;
    }

    public void setDateOfSigning(String dateOfSigning) {
        this.dateOfSigning = dateOfSigning;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public int getChangenumber() {
        return changenumber;
    }

    public void setChangenumber(int changenumber) {
        this.changenumber = changenumber;
    }
}
