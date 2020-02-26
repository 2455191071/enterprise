package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/19 16:09
 */

import java.util.Date;

/**
 * @program: enterprise
 *
 * @description: 项目模板表
 *
 * @author: 陆岳南
 *
 * @create: 2020-02-19 16:09
 **/
public class ProjectTemplate {
     private int pid;//模板编号
    private String  name;//模板名称
    private int stageNum;//阶段数
    private int  time;//耗时(天)
    private String  remark;//备注
    private Date createDate;//创建时间
    private String  createName;//创建人
    private Date  updateDate;//最近更新时间
    private String  alter;//最近修改人

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStageNum() {
        return stageNum;
    }

    public void setStageNum(int stageNum) {
        this.stageNum = stageNum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }
}
