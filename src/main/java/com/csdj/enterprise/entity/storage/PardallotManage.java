package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 实体类：同价调拨管理表
 */
public class PardallotManage {
    private String pmId; //同价调拨管理编号
    private Date pDate; //日期
    private String warehouseId; //仓库编号
    private String clerkId; //职员编号
    private String pRemark; //备注

    public String getPmId() {
        return pmId;
    }

    public void setPmId(String pmId) {
        this.pmId = pmId;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getClerkId() {
        return clerkId;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark;
    }
}
