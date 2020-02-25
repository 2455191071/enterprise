package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 生产领料管理表
 */
public class ProductionManage {
    private String pPickingId; //领料编号
    private Date pDate; //日期
    private String pWarehouseId; //仓库编号
    private int pQuantity; //数量
    private String pCost; //成本
    private String pOfficeclerkId; //职员编号
    private String pWorkshop; //领料车间
    private String pProductionId; //生产编号
    private String pRemark; //备注

    public String getpPickingId() {
        return pPickingId;
    }

    public void setpPickingId(String pPickingId) {
        this.pPickingId = pPickingId;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public String getpWarehouseId() {
        return pWarehouseId;
    }

    public void setpWarehouseId(String pWarehouseId) {
        this.pWarehouseId = pWarehouseId;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getpCost() {
        return pCost;
    }

    public void setpCost(String pCost) {
        this.pCost = pCost;
    }

    public String getpOfficeclerkId() {
        return pOfficeclerkId;
    }

    public void setpOfficeclerkId(String pOfficeclerkId) {
        this.pOfficeclerkId = pOfficeclerkId;
    }

    public String getpWorkshop() {
        return pWorkshop;
    }

    public void setpWorkshop(String pWorkshop) {
        this.pWorkshop = pWorkshop;
    }

    public String getpProductionId() {
        return pProductionId;
    }

    public void setpProductionId(String pProductionId) {
        this.pProductionId = pProductionId;
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark;
    }
}
