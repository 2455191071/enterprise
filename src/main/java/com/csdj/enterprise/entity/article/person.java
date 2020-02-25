package com.csdj.enterprise.entity.article;/**
 * Description: enterprise
 * <p>
 * Created by mi on 2020/2/19 16:05
 */

/**
 * @program: enterprise
 *
 * @description: 责任人表
 *
 * @author: 陆岳南
 *
 * @create: 2020-02-19 16:05
 **/
public class person {
    private int pid;//工号
    private String name;//姓名
    private String sex;//性别
    private String branch;//部门
    private String position;//主职位
    private String phone;//电话

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
