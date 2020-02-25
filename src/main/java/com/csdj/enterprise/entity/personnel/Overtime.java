package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:46
 * @Description:加班实体类
 */
public class Overtime {
    private int overtimeId;//加班编号
    private String overtimeNum;//编号
    private int otypeId;//加班类型
    private int clerkId;//加班人员
    private  String cause;//事由
    private String startDate;//起始时间
    private String endDate;//截止时间
    private int hourage;//小时数
    private int yetRest;//已调休小时数
    private int canRest;//可调休小时数
    private int documentMaker;//制单人
    private String documentDate;//制单时间

    public int getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(int overtimeId) {
        this.overtimeId = overtimeId;
    }

    public String getOvertimeNum() {
        return overtimeNum;
    }

    public void setOvertimeNum(String overtimeNum) {
        this.overtimeNum = overtimeNum;
    }

    public int getOtypeId() {
        return otypeId;
    }

    public void setOtypeId(int otypeId) {
        this.otypeId = otypeId;
    }

    public int getClerkId() {
        return clerkId;
    }

    public void setClerkId(int clerkId) {
        this.clerkId = clerkId;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
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

    public int getHourage() {
        return hourage;
    }

    public void setHourage(int hourage) {
        this.hourage = hourage;
    }

    public int getYetRest() {
        return yetRest;
    }

    public void setYetRest(int yetRest) {
        this.yetRest = yetRest;
    }

    public int getCanRest() {
        return canRest;
    }

    public void setCanRest(int canRest) {
        this.canRest = canRest;
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
