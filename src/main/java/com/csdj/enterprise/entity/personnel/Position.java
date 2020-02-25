package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/10:48
 * @Description:职位实体类
 */
public class Position {
    private int positionId;//职位编号
    private String positionName;//职位名称
    private int branchId;//所属部门

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
