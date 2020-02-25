package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/12:10
 * @Description:排班实体类
 */
public class Scheduling {
    private int scheId;//排班编号
    private String scheName;//排班名称
    private int systemId;//上班制度
    private String startDate;//起始时间
    private String endDate;//截止时间
    private int numPeople;//人数
    private int creator;//创建人
    private String createDate;//创建日期
    private int branchId;//人员范围

    public int getScheId() {

        return scheId;
    }

    public void setScheId(int scheId) {
        this.scheId = scheId;
    }

    public String getScheName() {
        return scheName;
    }

    public void setScheName(String scheName) {
        this.scheName = scheName;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
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

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
