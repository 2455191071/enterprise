package com.csdj.enterprise.entity.storage;
/**
 * 莫宏峡
 * 实体类：库存总览表
 */

public class Overview {
    private String overviewId;// 库存总览编号。主键，自动增长
    private String lnventoryId;// 库存编号。外键，关联库存报损表
    private String commodityId;// 商品编号。外键，关联商品表
    private String warehouseId;// 仓库编号。外键，关联仓库表
    private int overviewQuan;// 数量
    private int overviewConse;//保守可用数
    private int  overviewOpt;// 乐观可用数
    private double overviewInve;//库存总价
    private double  overviewCost;// 成本单价
    private int overviewInto;//入库数量
    private int  overviewOut;// 出库数量
    private int overviewGrint;//草稿入库数
    private int overviewGrout;//  草稿出库数
    private int overviewLocki;//  锁定数
    private int overviewFigur;// 在途数
    private Lnventory lnveId;//库存编号。外键，对象关联库存报损表
    private Depot wareId; //仓库编号，外键，对象关联仓库表


    public Lnventory getLnveId() {
        return lnveId;
    }

    public void setLnveId(Lnventory lnveId) {
        this.lnveId = lnveId;
    }

    public Depot getWareId() {
        return wareId;
    }

    public void setWareId(Depot wareId) {
        this.wareId = wareId;
    }

    public String getOverviewId() {
        return overviewId;
    }

    public void setOverviewId(String overviewId) {
        this.overviewId = overviewId;
    }

    public String getLnventoryId() {
        return lnventoryId;
    }

    public void setLnventoryId(String lnventoryId) {
        this.lnventoryId = lnventoryId;
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

    public int getOverviewQuan() {
        return overviewQuan;
    }

    public void setOverviewQuan(int overviewQuan) {
        this.overviewQuan = overviewQuan;
    }

    public int getOverviewConse() {
        return overviewConse;
    }

    public void setOverviewConse(int overviewConse) {
        this.overviewConse = overviewConse;
    }

    public int getOverviewOpt() {
        return overviewOpt;
    }

    public void setOverviewOpt(int overviewOpt) {
        this.overviewOpt = overviewOpt;
    }

    public double getOverviewInve() {
        return overviewInve;
    }

    public void setOverviewInve(double overviewInve) {
        this.overviewInve = overviewInve;
    }

    public double getOverviewCost() {
        return overviewCost;
    }

    public void setOverviewCost(double overviewCost) {
        this.overviewCost = overviewCost;
    }

    public int getOverviewInto() {
        return overviewInto;
    }

    public void setOverviewInto(int overviewInto) {
        this.overviewInto = overviewInto;
    }

    public int getOverviewOut() {
        return overviewOut;
    }

    public void setOverviewOut(int overviewOut) {
        this.overviewOut = overviewOut;
    }

    public int getOverviewGrint() {
        return overviewGrint;
    }

    public void setOverviewGrint(int overviewGrint) {
        this.overviewGrint = overviewGrint;
    }

    public int getOverviewGrout() {
        return overviewGrout;
    }

    public void setOverviewGrout(int overviewGrout) {
        this.overviewGrout = overviewGrout;
    }

    public int getOverviewLocki() {
        return overviewLocki;
    }

    public void setOverviewLocki(int overviewLocki) {
        this.overviewLocki = overviewLocki;
    }

    public int getOverviewFigur() {
        return overviewFigur;
    }

    public void setOverviewFigur(int overviewFigur) {
        this.overviewFigur = overviewFigur;
    }
}
