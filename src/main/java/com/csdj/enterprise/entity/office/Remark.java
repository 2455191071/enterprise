package com.csdj.enterprise.entity.office;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  点评表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Remark implements Serializable{
    private int mId;//编号
    private int mName;//点评人【员工表】
    private Date mDate;//点评时间
    private String mText;//点评意见

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmName() {
        return mName;
    }

    public void setmName(int mName) {
        this.mName = mName;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
