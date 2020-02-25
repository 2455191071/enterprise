package com.csdj.enterprise.entity.storage;

import java.util.Date;

/**
 * 李丹妮
 * 列表外协发料表
 */
public class OutStoreisSue {
    private String outstoreissue; //列表外协发料编号
    private Date osdate; //日期
    private String outsourceId; //外协编号
    private String warehouseId; //仓库编号
    private String supplierId; //供应商编号
    private String oremark; //备注
    private String officeclerkId; //职员编号

    public String getOutstoreissue() {
        return outstoreissue;
    }

    public void setOutstoreissue(String outstoreissue) {
        this.outstoreissue = outstoreissue;
    }

    public Date getOsdate() {
        return osdate;
    }

    public void setOsdate(Date osdate) {
        this.osdate = osdate;
    }

    public String getOutsourceId() {
        return outsourceId;
    }

    public void setOutsourceId(String outsourceId) {
        this.outsourceId = outsourceId;
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

    public String getOremark() {
        return oremark;
    }

    public void setOremark(String oremark) {
        this.oremark = oremark;
    }

    public String getOfficeclerkId() {
        return officeclerkId;
    }

    public void setOfficeclerkId(String officeclerkId) {
        this.officeclerkId = officeclerkId;
    }
}
