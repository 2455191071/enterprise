package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：制令单表
 */
public class Morder {
    private int no;//序号
    private String morderId;//编号
    private String productId;//产品,产品外键
    private int mrp;//MRP运算编号
    private String odate;//制令日期
    private String delivery;//要求交期
    private String planId;//生产计划,生产计划外键
    private String warehouseId;//预入仓库,仓库外键
    private String superior;//上级
    private int quantity;//数量
    private int qis;//质检制单数
    private int qicmo;//质检可制单数
    private int dss;//直接入库制单数
    private int cbmditw;//直接入库可制单数
    private int warehouse;//已入库数
    private String note;//备注

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getMorderId() {
        return morderId;
    }

    public void setMorderId(String morderId) {
        this.morderId = morderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQis() {
        return qis;
    }

    public void setQis(int qis) {
        this.qis = qis;
    }

    public int getQicmo() {
        return qicmo;
    }

    public void setQicmo(int qicmo) {
        this.qicmo = qicmo;
    }

    public int getDss() {
        return dss;
    }

    public void setDss(int dss) {
        this.dss = dss;
    }

    public int getCbmditw() {
        return cbmditw;
    }

    public void setCbmditw(int cbmditw) {
        this.cbmditw = cbmditw;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
