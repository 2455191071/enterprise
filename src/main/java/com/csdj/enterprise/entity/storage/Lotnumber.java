package com.csdj.enterprise.entity.storage;
/**
 * 莫宏峡
 * 实体类：批号库存管理表
 */

public class Lotnumber {
    private String lotnumberId ;//批号编号，主键
    private String commodityId ;// 商品编号。外键，关联商品表
    private String lotnumberLot ;// 批号
    private String lnventoryId;// 库存编号。外键，关联库存表
    private int lotnumberCan;// 可发货数
    private int lotnumberOut;// 入库数量
    private int lotnumberInto;//  出库数量
    private int lotnumberGo;//  草稿入库数
    private int lotnumberGi;//草稿出库数

    public String getLotnumberId() {
        return lotnumberId;
    }

    public void setLotnumberId(String lotnumberId) {
        this.lotnumberId = lotnumberId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getLotnumberLot() {
        return lotnumberLot;
    }

    public void setLotnumberLot(String lotnumberLot) {
        this.lotnumberLot = lotnumberLot;
    }

    public String getLnventoryId() {
        return lnventoryId;
    }

    public void setLnventoryId(String lnventoryId) {
        this.lnventoryId = lnventoryId;
    }

    public int getLotnumberCan() {
        return lotnumberCan;
    }

    public void setLotnumberCan(int lotnumberCan) {
        this.lotnumberCan = lotnumberCan;
    }

    public int getLotnumberOut() {
        return lotnumberOut;
    }

    public void setLotnumberOut(int lotnumberOut) {
        this.lotnumberOut = lotnumberOut;
    }

    public int getLotnumberInto() {
        return lotnumberInto;
    }

    public void setLotnumberInto(int lotnumberInto) {
        this.lotnumberInto = lotnumberInto;
    }

    public int getLotnumberGo() {
        return lotnumberGo;
    }

    public void setLotnumberGo(int lotnumberGo) {
        this.lotnumberGo = lotnumberGo;
    }

    public int getLotnumberGi() {
        return lotnumberGi;
    }

    public void setLotnumberGi(int lotnumberGi) {
        this.lotnumberGi = lotnumberGi;
    }
}
