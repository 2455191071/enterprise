package com.csdj.enterprise.entity.logistics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/10:40
 * @Description:清理记录实体类
 */
public class Clear {
    private int clearId;//清理编号
    private String clearNum;//编号
    private String clearDate;//清理日期
    private int remain;//净剩值
    private int ctypeId;//清理类型
    private int assetId;//设备资产
    private int clerkId;//清理人
    private int branchId;//清理职位
    private int clearMoney;//清理金额
    private int expense;//清理费用
    private String verify;//核准
    private String remark;//备注
    private String accessory ;//附件

    public int getClearId() {
        return clearId;
    }

    public void setClearId(int clearId) {
        this.clearId = clearId;
    }

    public String getClearNum() {
        return clearNum;
    }

    public void setClearNum(String clearNum) {
        this.clearNum = clearNum;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public int getCtypeId() {
        return ctypeId;
    }

    public void setCtypeId(int ctypeId) {
        this.ctypeId = ctypeId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getClerkId() {
        return clerkId;
    }

    public void setClerkId(int clerkId) {
        this.clerkId = clerkId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getClearMoney() {
        return clearMoney;
    }

    public void setClearMoney(int clearMoney) {
        this.clearMoney = clearMoney;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }
}
