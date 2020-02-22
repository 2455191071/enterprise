package com.csdj.enterprise.entity.finance;


import java.util.Date;

public class Supadjust {

  private int adjustid;
  private String cause;
  private String supplier;
  private String brokerage;
  private String position;
  private Date adtime;
  private double addmoney;
  private double lessmoney;
  private String attachment;
  private String detail;
  private String A;
  private String B;


  public int getAdjustid() {
    return adjustid;
  }

  public void setAdjustid(int adjustid) {
    this.adjustid = adjustid;
  }


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }


  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public String getBrokerage() {
    return brokerage;
  }

  public void setBrokerage(String brokerage) {
    this.brokerage = brokerage;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public Date getAdtime() {
    return adtime;
  }

  public void setAdtime(Date adtime) {
    this.adtime = adtime;
  }


  public double getAddmoney() {
    return addmoney;
  }

  public void setAddmoney(double addmoney) {
    this.addmoney = addmoney;
  }


  public double getLessmoney() {
    return lessmoney;
  }

  public void setLessmoney(double lessmoney) {
    this.lessmoney = lessmoney;
  }


  public String getAttachment() {
    return attachment;
  }

  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public String getA() {
    return A;
  }

  public void setA(String A) {
    this.A = A;
  }


  public String getB() {
    return B;
  }

  public void setB(String B) {
    this.B = B;
  }

}
