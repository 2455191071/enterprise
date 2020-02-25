package com.csdj.enterprise.entity.storage;
/**
 * 莫宏峡
 * 实体类：商品序列号管理表
 */

public class Sequence {
    private String sequenceId ;//商品序列号管理编号，主键
    private String commodityId ;// 商品编号，外键，关联商品表
    private String sequenceCdate ;//   生产日期
    private String sequenceJdate ;// 截止日期
    private String warehouseId ;// 仓库编号，外键，关联仓库表
    private double sequence ;//   成本
    private String memberId ;// 会员编号，外键，关联会员表
    private String sequenceBei ;//     备注

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getSequenceCdate() {
        return sequenceCdate;
    }

    public void setSequenceCdate(String sequenceCdate) {
        this.sequenceCdate = sequenceCdate;
    }

    public String getSequenceJdate() {
        return sequenceJdate;
    }

    public void setSequenceJdate(String sequenceJdate) {
        this.sequenceJdate = sequenceJdate;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public double getSequence() {
        return sequence;
    }

    public void setSequence(double sequence) {
        this.sequence = sequence;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getSequenceBei() {
        return sequenceBei;
    }

    public void setSequenceBei(String sequenceBei) {
        this.sequenceBei = sequenceBei;
    }
}
