package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:26
 * @Description: 请假实体类
 */
public class Leave {
    private int  leaveId;//请假编号
    private String leaveNum;//编号
    private int clerkId;//请假职员
    private int branchId;//请假部门
    private int typeId;//请假类型编号
    private String startDate;//起始时间
    private String endDate;//截止时间
    private String leaveCause;//请假事由
    private String  duration;//结算时长
    private String classDate;//补班时间
    private String cerified;//已核销调休（时）
    private String stayVerified;//待核销调休（时）
    private int documentMaker;//制单人
    private String documentDate;//制单时间

    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public String getLeaveNum() {
        return leaveNum;
    }

    public void setLeaveNum(String leaveNum) {
        this.leaveNum = leaveNum;
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

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

    public String getLeaveCause() {
        return leaveCause;
    }

    public void setLeaveCause(String leaveCause) {
        this.leaveCause = leaveCause;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getClassDate() {
        return classDate;
    }

    public void setClassDate(String classDate) {
        this.classDate = classDate;
    }

    public String getCerified() {
        return cerified;
    }

    public void setCerified(String cerified) {
        this.cerified = cerified;
    }

    public String getStayVerified() {
        return stayVerified;
    }

    public void setStayVerified(String stayVerified) {
        this.stayVerified = stayVerified;
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
