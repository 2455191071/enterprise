package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：用料计划表a
 */
public class Mater {
    private int materId;//编号,主键自增长
    private String materialsId;//物料,物料外键
    private int dpserving;//每份用量
    private int noplans;//计划份数
    private int pusage;//计划用量
    private int pquantity;//已制单量
    private int cmasquantity;//可制单量
    private int used;//已用量
    private int aamount;//可用量
    private String pwarehouse;//默认领料仓库
    private String mproducts;//用料产品编号

    public int getMaterId() {
        return materId;
    }

    public void setMaterId(int materId) {
        this.materId = materId;
    }

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId;
    }

    public int getDpserving() {
        return dpserving;
    }

    public void setDpserving(int dpserving) {
        this.dpserving = dpserving;
    }

    public int getNoplans() {
        return noplans;
    }

    public void setNoplans(int noplans) {
        this.noplans = noplans;
    }

    public int getPusage() {
        return pusage;
    }

    public void setPusage(int pusage) {
        this.pusage = pusage;
    }

    public int getPquantity() {
        return pquantity;
    }

    public void setPquantity(int pquantity) {
        this.pquantity = pquantity;
    }

    public int getCmasquantity() {
        return cmasquantity;
    }

    public void setCmasquantity(int cmasquantity) {
        this.cmasquantity = cmasquantity;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getAamount() {
        return aamount;
    }

    public void setAamount(int aamount) {
        this.aamount = aamount;
    }

    public String getPwarehouse() {
        return pwarehouse;
    }

    public void setPwarehouse(String pwarehouse) {
        this.pwarehouse = pwarehouse;
    }

    public String getMproducts() {
        return mproducts;
    }

    public void setMproducts(String mproducts) {
        this.mproducts = mproducts;
    }


}
