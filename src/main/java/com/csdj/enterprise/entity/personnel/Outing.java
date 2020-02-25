package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:52
 * @Description:外出实体类
 */
public class Outing {
    private int outingId;//外出编号
    private String outingNum;//编号
    private int clerkId;//外出人员
    private int branchId;//外出部门
    private String startDate;//起始时间
    private String endDate;//截止时间
    private String outingCause;//外出事由
    private int documentMaker;//制单人
    private String documentDate;//制单时间

    public int getOutingId() {
        return outingId;
    }

    public void setOutingId(int outingId) {
        this.outingId = outingId;
    }

    public String getOutingNum() {
        return outingNum;
    }

    public void setOutingNum(String outingNum) {
        this.outingNum = outingNum;
    }

    public int getClerkId() {
        return clerkId;
    }

    public void setClerkId(int clerkId) {
        this.clerkId = clerkId;
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

    public String getOutingCause() {
        return outingCause;
    }

    public void setOutingCause(String outingCause) {
        this.outingCause = outingCause;
    }

    public int getDocumentMaker() {
        return documentMaker;
    }

    public void setDocumentMaker(int documentMaker) {
        this.documentMaker = documentMaker;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }
}
