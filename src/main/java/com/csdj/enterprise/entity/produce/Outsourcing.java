package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：外协单表
 */
public class Outsourcing {
    private int no;//序号
    private String outsourcingId;//编号,主键
    private String productId;//产品,产品外键
    private int mrp;//MRP运算编号
    private String date;//日期
    private String delivery;//要求交期
    private String planId;//生产计划,生产计划外键
    private int quantity;//数量
    private int warehouse;//已入库数
    private int stored;//待入库数
    private String supplierId;//供应商,供应商外键
    private String contactId;//供应商联系人,供应商联系人外键
    private int outsourcerId;//外协员,职员外键
    private String note;//备注
    private String annex;//附件

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public int getStored() {
        return stored;
    }

    public void setStored(int stored) {
        this.stored = stored;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public int getOutsourcerId() {
        return outsourcerId;
    }

    public void setOutsourcerId(int outsourcerId) {
        this.outsourcerId = outsourcerId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }


}
