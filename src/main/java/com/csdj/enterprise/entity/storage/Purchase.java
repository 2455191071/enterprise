package com.csdj.enterprise.entity.storage;

/**
 * 曾雅思    采购表
 */
public class Purchase {
    private String purchaseId;     //采购编号
    private String purDate;        //采购日期
    private String depotId;       //仓库编号
    private String supplierId;    //供应商编号
    private int Purnumber;       //采购数量
    private int Purmoney;       //金额
    private String exchangeId;  //采购调换编号
    private String postname;    //过账人
    private String administrator;//库管理员
    private String single;         //制单人
    private String remark;          //备注

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurDate() {
        return purDate;
    }

    public void setPurDate(String purDate) {
        this.purDate = purDate;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public int getPurnumber() {
        return Purnumber;
    }

    public void setPurnumber(int purnumber) {
        Purnumber = purnumber;
    }

    public int getPurmoney() {
        return Purmoney;
    }

    public void setPurmoney(int purmoney) {
        Purmoney = purmoney;
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
