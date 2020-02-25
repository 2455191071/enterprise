package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：生产入库表
 */
public class Pstorage {
    private String pstorageId;//编号,主键
    private String date;//日期
    private String morderId;//制令单,制令单外键
    private String workshop;//车间
    private String warehouseId;//仓库,仓库外键
    private String planId;//生产计划,生产计划外键
    private String handleId;//经手人,职员外键
    private String note;//备注
    private int manufacturingId;//制单人,用户登录外键
    private String manufacturingdate;//制单时间
    private int modifyId;//最近修改人,用户登录外键
    private String modifydate;//最近更新时间

    public String getPstorageId() {
        return pstorageId;
    }

    public void setPstorageId(String pstorageId) {
        this.pstorageId = pstorageId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMorderId() {
        return morderId;
    }

    public void setMorderId(String morderId) {
        this.morderId = morderId;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getHandleId() {
        return handleId;
    }

    public void setHandleId(String handleId) {
        this.handleId = handleId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getManufacturingId() {
        return manufacturingId;
    }

    public void setManufacturingId(int manufacturingId) {
        this.manufacturingId = manufacturingId;
    }

    public String getManufacturingdate() {
        return manufacturingdate;
    }

    public void setManufacturingdate(String manufacturingdate) {
        this.manufacturingdate = manufacturingdate;
    }

    public int getModifyId() {
        return modifyId;
    }

    public void setModifyId(int modifyId) {
        this.modifyId = modifyId;
    }

    public String getModifydate() {
        return modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
    }


}
