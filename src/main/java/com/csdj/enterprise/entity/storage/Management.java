package com.csdj.enterprise.entity.storage;
/**
 * 莫宏峡
 * 实体类：库存流水管理表
 */

public class Management {
    private String managementId;//库存流水编号，主键
    private String managementDate;// 日期
    private String commodityId;// 商品编号，外键，关联商品表
    private String warehouseId;//仓库编号。外键，关联仓库表
    private int managementQuant;//  数量
    private double managementAmo;//金额
    private double managementCost;//成本单价
    private int managementCome;//来源数据
    private String managementBei;// 备注

    public String getManagementId() {
        return managementId;
    }

    public void setManagementId(String managementId) {
        this.managementId = managementId;
    }

    public String getManagementDate() {
        return managementDate;
    }

    public void setManagementDate(String managementDate) {
        this.managementDate = managementDate;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getManagementQuant() {
        return managementQuant;
    }

    public void setManagementQuant(int managementQuant) {
        this.managementQuant = managementQuant;
    }

    public double getManagementAmo() {
        return managementAmo;
    }

    public void setManagementAmo(double managementAmo) {
        this.managementAmo = managementAmo;
    }

    public double getManagementCost() {
        return managementCost;
    }

    public void setManagementCost(double managementCost) {
        this.managementCost = managementCost;
    }

    public int getManagementCome() {
        return managementCome;
    }

    public void setManagementCome(int managementCome) {
        this.managementCome = managementCome;
    }

    public String getManagementBei() {
        return managementBei;
    }

    public void setManagementBei(String managementBei) {
        this.managementBei = managementBei;
    }
}
