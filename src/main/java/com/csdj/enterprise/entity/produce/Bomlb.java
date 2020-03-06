package com.csdj.enterprise.entity.produce;
/**
 * 李邦
 * 实体类：物料清单表
 */
public class Bomlb {
    private int no;//序号
    private String bomId;//编号
    private int defaults;//默认,否为0,是为1
    private String materialsId;//物料,物料外键
    private int noc;//子件数
    private String warehouseId;//仓库,仓库外键
    private int founderId;//创建人,用户登录外键
    private String founderdate;//创建时间
    private String note;//备注

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
    }

    public int getDefaults() {
        return defaults;
    }

    public void setDefaults(int defaults) {
        this.defaults = defaults;
    }

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId;
    }

    public int getNoc() {
        return noc;
    }

    public void setNoc(int noc) {
        this.noc = noc;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getFounderId() {
        return founderId;
    }

    public void setFounderId(int founderId) {
        this.founderId = founderId;
    }

    public String getFounderdate() {
        return founderdate;
    }

    public void setFounderdate(String founderdate) {
        this.founderdate = founderdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
