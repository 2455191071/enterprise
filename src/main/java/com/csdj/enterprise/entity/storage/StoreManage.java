package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 实体类：库管理表
 */
public class StoreManage {
    private String sId; //库管理编号
    private Date sDate; //日期
    private String sWarehouseId; //仓库编号
    private int sQuantity; //数量
    private String sCost; //成本
    private String sPreparedby; //制单人
    private String sOfficeclerkId; //职员编号
    private String sProject; //项目
    private String sRemark; //备注

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public String getsWarehouseId() {
        return sWarehouseId;
    }

    public void setsWarehouseId(String sWarehouseId) {
        this.sWarehouseId = sWarehouseId;
    }

    public int getsQuantity() {
        return sQuantity;
    }

    public void setsQuantity(int sQuantity) {
        this.sQuantity = sQuantity;
    }

    public String getsCost() {
        return sCost;
    }

    public void setsCost(String sCost) {
        this.sCost = sCost;
    }

    public String getsPreparedby() {
        return sPreparedby;
    }

    public void setsPreparedby(String sPreparedby) {
        this.sPreparedby = sPreparedby;
    }

    public String getsOfficeclerkId() {
        return sOfficeclerkId;
    }

    public void setsOfficeclerkId(String sOfficeclerkId) {
        this.sOfficeclerkId = sOfficeclerkId;
    }

    public String getsProject() {
        return sProject;
    }

    public void setsProject(String sProject) {
        this.sProject = sProject;
    }

    public String getsRemark() {
        return sRemark;
    }

    public void setsRemark(String sRemark) {
        this.sRemark = sRemark;
    }
}
