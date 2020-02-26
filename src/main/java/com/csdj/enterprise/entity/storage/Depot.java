package com.csdj.enterprise.entity.storage;

/**
 * 曾雅思   仓库表
 */
public class Depot {
    private String depotId;       //仓库编号
    private String Dename;       //仓库名称
    private String Declassify;   //仓库分类
    private String department;   //所属部门
    private String fanumber;     //发货数量
    private String shounumber;  //收货数量
    private String remark;     //备注

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getDename() {
        return Dename;
    }

    public void setDename(String dename) {
        Dename = dename;
    }

    public String getDeclassify() {
        return Declassify;
    }

    public void setDeclassify(String declassify) {
        Declassify = declassify;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFanumber() {
        return fanumber;
    }

    public void setFanumber(String fanumber) {
        this.fanumber = fanumber;
    }

    public String getShounumber() {
        return shounumber;
    }

    public void setShounumber(String shounumber) {
        this.shounumber = shounumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
