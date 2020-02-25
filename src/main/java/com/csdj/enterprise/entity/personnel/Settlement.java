package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:56
 * @Description:考勤结算实体类
 */
public class Settlement {
    private int settlId;//结算编号
    private String settlName;//结算名称
    private int branchId;//机构
    private String startDate;//开始日期
    private String endDate;//结束日期
    private int numPeople;//人员数
    private int credit;//台账数
    private int stypeId;//类型

    public int getSettlId() {
        return settlId;
    }

    public void setSettlId(int settlId) {
        this.settlId = settlId;
    }

    public String getSettlName() {
        return settlName;
    }

    public void setSettlName(String settlName) {
        this.settlName = settlName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getStypeId() {
        return stypeId;
    }

    public void setStypeId(int stypeId) {
        this.stypeId = stypeId;
    }
}
