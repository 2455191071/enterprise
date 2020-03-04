package com.csdj.enterprise.entity.finance;


import java.util.Date;

public class Suppaymentall {

  private int payid;
  private Date dates;
  private String supname;
  private String abstracts;
  private double prepayment;
  private double spMoney;
  private double stMoney;
  private double soMoney;
  private double amount;
  private String documentid;
  private String A;
  private String B;


  public int getPayid() {
    return payid;
  }

  public void setPayid(int payid) {
    this.payid = payid;
  }


  public Date getDates() {
    return dates;
  }

  public void setDates(Date dates) {
    this.dates = dates;
  }


  public String getSupname() {
    return supname;
  }

  public void setSupname(String supname) {
    this.supname = supname;
  }


  public String getAbstract() {
    return abstracts;
  }

  public void setAbstract(String abstracts) {
    this.abstracts = abstracts;
  }


  public double getPrepayment() {
    return prepayment;
  }

  public void setPrepayment(double prepayment) {
    this.prepayment = prepayment;
  }


  public double getSpMoney() {
    return spMoney;
  }

  public void setSpMoney(double spMoney) {
    this.spMoney = spMoney;
  }


  public double getStMoney() {
    return stMoney;
  }

  public void setStMoney(double stMoney) {
    this.stMoney = stMoney;
  }


  public double getSoMoney() {
    return soMoney;
  }

  public void setSoMoney(double soMoney) {
    this.soMoney = soMoney;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public String getDocumentid() {
    return documentid;
  }

  public void setDocumentid(String documentid) {
    this.documentid = documentid;
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
