package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：集中生产表a
 */
public class Productionlb {
    private int productionId;//编号,主键自增长
    private String documentId;//来源单据,来源单据外键
    private String date;//来源日期
    private String warehouseId;//仓库,仓库外键
    private String materialsId;//物料,物料外键
    private int demand;//需求量
    private int pending;//待制单量
    private String maturity;//期限

    public int getProductionId() {
        return productionId;
    }

    public void setProductionId(int productionId) {
        this.productionId = productionId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }


}
