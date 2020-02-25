package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:11
 * @Description:考勤补签实体类
 */
public class Retroactive {
    private int retroId;//补签编号
    private String retNum;//编号
    private int clerkId;//职员编号
    private int branchId;//部门编号
    private String signDate;//签到时间
    private String cause;//事由
    private String official;//正式
    private String status;//审核状态
    private int documentMaker;//制单人
    private String documentDate;//制单时间

    public int getRetroId() {
        return retroId;
    }

    public void setRetroId(int retroId) {
        this.retroId = retroId;
    }

    public String getRetNum() {
        return retNum;
    }

    public void setRetNum(String retNum) {
        this.retNum = retNum;
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

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
