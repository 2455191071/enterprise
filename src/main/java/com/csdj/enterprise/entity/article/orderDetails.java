package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/20 15:23
 */

/**
 * @program: enterprise
 *
 * @description: 订单详情表
 *
 * @author: miss陆岳南
 *
 * @create: 2020-02-20 15:23
 **/
public class orderDetails {
    private int id;//详情编号
    private int oid;//订单编号
    private String material;//商品物料
    private String Art_No;//货号
    private String specification;//规格
    private int  quantity;//数量
    private String xiaohe;//需求核销数
    private String unit;//单位
    private int matrixing;//单位换算
    private Double  unitprice;//单价
    private Double money;//金额
    private String remark;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getArt_No() {
        return Art_No;
    }

    public void setArt_No(String art_No) {
        Art_No = art_No;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getXiaohe() {
        return xiaohe;
    }

    public void setXiaohe(String xiaohe) {
        this.xiaohe = xiaohe;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getMatrixing() {
        return matrixing;
    }

    public void setMatrixing(int matrixing) {
        this.matrixing = matrixing;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
