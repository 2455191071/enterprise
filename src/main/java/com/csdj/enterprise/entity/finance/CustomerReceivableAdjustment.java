package com.csdj.enterprise.entity.finance;

/**
 * 客户应收调整类
 */
public class CustomerReceivableAdjustment {
    private String Id;//编号
    private String adjustDate;//调整日期
    private String client;//客户
    private String adjustReason;//调整原因
    private double loweredAmount;//调减金额
    private double increaseAmount;//调增金额
    private String handled;//经手人

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAdjustDate() {
        return adjustDate;
    }

    public void setAdjustDate(String adjustDate) {
        this.adjustDate = adjustDate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAdjustReason() {
        return adjustReason;
    }

    public void setAdjustReason(String adjustReason) {
        this.adjustReason = adjustReason;
    }

    public double getLoweredAmount() {
        return loweredAmount;
    }

    public void setLoweredAmount(double loweredAmount) {
        this.loweredAmount = loweredAmount;
    }

    public double getIncreaseAmount() {
        return increaseAmount;
    }

    public void setIncreaseAmount(double increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    public String getHandled() {
        return handled;
    }

    public void setHandled(String handled) {
        this.handled = handled;
    }
}
