package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:36
 * @Description: 出差实体类
 */
public class Evection {
    private int evectionId;//出差编号
    private String evectionNum;//编号
    private int clerkId;//出差职员
    private int branchId;//出差部门
    private String startDate;//起始时间
    private String endDate;//截止时间
    private int dayNum;//自然天数
    private String cause;//事由
    private int documentMaker;//制单人
    private String documentDate;//制单时间

    public int getEvectionId() {
        return evectionId;
    }

    public void setEvectionId(int evectionId) {
        this.evectionId = evectionId;
    }

    public String getEvectionNum() {
        return evectionNum;
    }

    public void setEvectionNum(String evectionNum) {
        this.evectionNum = evectionNum;
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

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
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
