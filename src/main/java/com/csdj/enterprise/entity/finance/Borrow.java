package com.csdj.enterprise.entity.finance;


import java.util.Date;

public class Borrow {

  private int borrownumber;
  private double borrAmount;
  private String borrName;
  private String borrMatter;
  private Date paidTime;
  private Date atachment;
  private String position;
  private String bydate;
  private int application;
  private String A;
  private String B;


  public int getBorrownumber() {
    return borrownumber;
  }

  public void setBorrownumber(int borrownumber) {
    this.borrownumber = borrownumber;
  }


  public double getBorrAmount() {
    return borrAmount;
  }

  public void setBorrAmount(double borrAmount) {
    this.borrAmount = borrAmount;
  }


  public String getBorrName() {
    return borrName;
  }

  public void setBorrName(String borrName) {
    this.borrName = borrName;
  }


  public String getBorrMatter() {
    return borrMatter;
  }

  public void setBorrMatter(String borrMatter) {
    this.borrMatter = borrMatter;
  }


  public Date getPaidTime() {
    return paidTime;
  }

  public void setPaidTime(Date paidTime) {
    this.paidTime = paidTime;
  }


  public Date getAtachment() {
    return atachment;
  }

  public void setAtachment(Date atachment) {
    this.atachment = atachment;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getBydate() {
    return bydate;
  }

  public void setBydate(String bydate) {
    this.bydate = bydate;
  }


  public int getApplication() {
    return application;
  }

  public void setApplication(int application) {
    this.application = application;
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
