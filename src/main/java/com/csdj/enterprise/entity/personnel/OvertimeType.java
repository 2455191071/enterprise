package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/11:50
 * @Description:加班类型实体类
 */
public class OvertimeType {
    private int  otypeId;//加班类型编号
    private String otypeName;//加班类型名称

    public int getOtypeId() {
        return otypeId;
    }

    public void setOtypeId(int otypeId) {
        this.otypeId = otypeId;
    }

    public String getOtypeName() {
        return otypeName;
    }

    public void setOtypeName(String otypeName) {
        this.otypeName = otypeName;
    }
}
