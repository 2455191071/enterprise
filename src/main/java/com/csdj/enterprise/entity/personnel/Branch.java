package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 *
 * @Auther: 李金艳
 * @Date: 2020/02/19/15:50
 * @Description: 部门实体类
 */
public class Branch {
    private int branchId;//部门编号
    private String branchName;//部门名称

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
