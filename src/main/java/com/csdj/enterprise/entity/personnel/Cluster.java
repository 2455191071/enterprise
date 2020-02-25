package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/10:50
 * @Description:
 */
public class Cluster {
    private int cluId;//群组编号
    private String cluName;//群组名称
    private int  cluNum;//成员数
    private String remark;//备注
    private String  createDate;//创建时间

    public int getCluId() {
        return cluId;
    }

    public void setCluId(int cluId) {
        this.cluId = cluId;
    }

    public String getCluName() {
        return cluName;
    }

    public void setCluName(String cluName) {
        this.cluName = cluName;
    }

    public int getCluNum() {
        return cluNum;
    }

    public void setCluNum(int cluNum) {
        this.cluNum = cluNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
