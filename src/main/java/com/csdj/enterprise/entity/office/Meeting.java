package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;


/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  会议室表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Meeting implements Serializable{
    private  int nId;  //编号
    private  String   nTitle; //主题
    private  int nName; //主持人【员工表】
    private  int nDispose; //主持人职位【职位表】
    private  int nNames; //与会人员【员工表】
    private  int nMeetRoom; //会议室【会议室表】
    private  Date  nBeginDate; //开始时间
    private  Date    nFinishDate; //结束时间
    private  String  nText; //会议内容

    private Meetroom mRoom;//会议室表

    public Meetroom getmRoom() {
        return mRoom;
    }

    public void setmRoom(Meetroom mRoom) {
        this.mRoom = mRoom;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public int getnName() {
        return nName;
    }

    public void setnName(int nName) {
        this.nName = nName;
    }

    public int getnDispose() {
        return nDispose;
    }

    public void setnDispose(int nDispose) {
        this.nDispose = nDispose;
    }

    public int getnNames() {
        return nNames;
    }

    public void setnNames(int nNames) {
        this.nNames = nNames;
    }

    public int getnMeetRoom() {
        return nMeetRoom;
    }

    public void setnMeetRoom(int nMeetRoom) {
        this.nMeetRoom = nMeetRoom;
    }

    public Date getnBeginDate() {
        return nBeginDate;
    }

    public void setnBeginDate(Date nBeginDate) {
        this.nBeginDate = nBeginDate;
    }

    public Date getnFinishDate() {
        return nFinishDate;
    }

    public void setnFinishDate(Date nFinishDate) {
        this.nFinishDate = nFinishDate;
    }

    public String getnText() {
        return nText;
    }

    public void setnText(String nText) {
        this.nText = nText;
    }
}
