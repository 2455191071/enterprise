package com.csdj.enterprise.entity.storage;

/**
 * 曾雅思     业务表
 */
public class Business {
    private String businessId;
    private String buname;
    private String gender;
    private String department;
    private String mainjob;
    private String telephone;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBuname() {
        return buname;
    }

    public void setBuname(String buname) {
        this.buname = buname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMainjob() {
        return mainjob;
    }

    public void setMainjob(String mainjob) {
        this.mainjob = mainjob;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
