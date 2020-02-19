package com.csdj.enterprise.entity.storage;

/**
 * 莫宏峡
 * 实体类：调整表
 */
public class Adjustment {
    private String  adjustmentId ;//调整编号，主键
    private String  adjustmentDate;//调整日期
    private String  warehouseId;//  仓库编号，外键，关联仓库表
    private String staffId;// 职员编号，外键，关联职员表
    private String adjustmentBei;//   调整备注

    public String getAdjustmentId() {
        return adjustmentId;
    }

    public void setAdjustmentId(String adjustmentId) {
        this.adjustmentId = adjustmentId;
    }

    public String getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(String adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getAdjustmentBei() {
        return adjustmentBei;
    }

    public void setAdjustmentBei(String adjustmentBei) {
        this.adjustmentBei = adjustmentBei;
    }
}
