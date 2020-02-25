package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:59
 * @Description:结算类型实体类
 */
public class SettlType {
    private int stypeId;//结算类型编号
    private String stypeName;//结算类型名称

    public int getStypeId() {
        return stypeId;
    }

    public void setStypeId(int stypeId) {
        this.stypeId = stypeId;
    }

    public String getStypeName() {
        return stypeName;
    }

    public void setStypeName(String stypeName) {
        this.stypeName = stypeName;
    }
}
