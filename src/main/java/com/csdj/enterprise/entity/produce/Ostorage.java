package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：外协入库表a
 */
public class Ostorage {
    private String ostorageId;//编号,主键
    private String date;//日期
    private int mrp;//MRP运算编号
    private String outsourcingId;//外协订单,外协单外键
    private String productId;//产品,产品外键
    private int number;//批号
    private String warehouseId;//仓库,仓库外键
    private String supplierId;//供应商,供应商外键
    private String handleId;//经手人,职员外键
    private String note;//备注
    private int quantity;//数量
    private double  puprice;//加工单价
    private double pcost;//加工费用
    private double  mprice;//材料单价
    private double mcost;//材料费用
    private double amount;//金额

    public String getOstorageId() {
        return ostorageId;
    }

    public void setOstorageId(String ostorageId) {
        this.ostorageId = ostorageId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public String getOutsourcingId() {
        return outsourcingId;
    }

    public void setOutsourcingId(String outsourcingId) {
        this.outsourcingId = outsourcingId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPuprice() {
        return puprice;
    }

    public void setPuprice(double puprice) {
        this.puprice = puprice;
    }

    public double getPcost() {
        return pcost;
    }

    public void setPcost(double pcost) {
        this.pcost = pcost;
    }

    public double getMprice() {
        return mprice;
    }

    public void setMprice(double mprice) {
        this.mprice = mprice;
    }

    public double getMcost() {
        return mcost;
    }

    public void setMcost(double mcost) {
        this.mcost = mcost;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
