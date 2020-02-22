package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  任务表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Task implements Serializable {
    private  int tId; //编号
    private  String tPhase; //阶段
    private  int  tType; //类型【任务类型表】
    private  String tLevel;//程度
    private  int  tRV;// 客户【客户表】
    private  String tTitle;//标题
    private  Date tBeginDate;//开始时间
    private  Date tFinishDate; //完成时限
    private  String tDispose; //处理职位
    private  int tStaff; //发起人【员工表】
    private  int tPost; //发起职位【职位表】
    private  String tDeyails; //详情

    private  Type type;//任务类型表

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettPhase() {
        return tPhase;
    }

    public void settPhase(String tPhase) {
        this.tPhase = tPhase;
    }

    public int gettType() {
        return tType;
    }

    public void settType(int tType) {
        this.tType = tType;
    }

    public String gettLevel() {
        return tLevel;
    }

    public void settLevel(String tLevel) {
        this.tLevel = tLevel;
    }

    public int gettRV() {
        return tRV;
    }

    public void settRV(int tRV) {
        this.tRV = tRV;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public Date gettBeginDate() {
        return tBeginDate;
    }

    public void settBeginDate(Date tBeginDate) {
        this.tBeginDate = tBeginDate;
    }

    public Date gettFinishDate() {
        return tFinishDate;
    }

    public void settFinishDate(Date tFinishDate) {
        this.tFinishDate = tFinishDate;
    }

    public String gettDispose() {
        return tDispose;
    }

    public void settDispose(String tDispose) {
        this.tDispose = tDispose;
    }

    public int gettStaff() {
        return tStaff;
    }

    public void settStaff(int tStaff) {
        this.tStaff = tStaff;
    }

    public int gettPost() {
        return tPost;
    }

    public void settPost(int tPost) {
        this.tPost = tPost;
    }

    public String gettDeyails() {
        return tDeyails;
    }

    public void settDeyails(String tDeyails) {
        this.tDeyails = tDeyails;
    }
}
