package com.csdj.enterprise.entity.storage;

/**
 * 莫宏峡
 * 实体类：库存报损表
 */
public class Lnventory {

    private String  lnventoryId ;//库存编号，主键
    private String  lnventoryDate;//  库存日期
    private String  warehouseId;//仓库编号，外键，关联仓库表
    private int   lnventoryQuan;//   数量
    private double  lnventoryAmou;//  金额
    private double  lnventoryCost;// 成本偏移
    private double  lnventoryProfit;//  拆装盈利
    private String  staffId;// 职员编号，外键，关联职员表
    private String  lnventoryBei;//备注

    public String getLnventoryId() {
        return lnventoryId;
    }

    public void setLnventoryId(String lnventoryId) {
        this.lnventoryId = lnventoryId;
    }

    public String getLnventoryDate() {
        return lnventoryDate;
    }

    public void setLnventoryDate(String lnventoryDate) {
        this.lnventoryDate = lnventoryDate;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getLnventoryQuan() {
        return lnventoryQuan;
    }

    public void setLnventoryQuan(int lnventoryQuan) {
        this.lnventoryQuan = lnventoryQuan;
    }

    public double getLnventoryAmou() {
        return lnventoryAmou;
    }

    public void setLnventoryAmou(double lnventoryAmou) {
        this.lnventoryAmou = lnventoryAmou;
    }

    public double getLnventoryCost() {
        return lnventoryCost;
    }

    public void setLnventoryCost(double lnventoryCost) {
        this.lnventoryCost = lnventoryCost;
    }

    public double getLnventoryProfit() {
        return lnventoryProfit;
    }

    public void setLnventoryProfit(double lnventoryProfit) {
        this.lnventoryProfit = lnventoryProfit;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLnventoryBei() {
        return lnventoryBei;
    }

    public void setLnventoryBei(String lnventoryBei) {
        this.lnventoryBei = lnventoryBei;
    }
}
