package com.csdj.enterprise.entity.finance;


public class Supvendor {

  private int vendorid;
  private String supname;
  private int suptype;
  private String buyer;
  private int day;
  private double amount;
  private double allpayment;
  private double current;
  private double prepayment;
  private double nowpay;
  private String A;
  private String B;


  public int getVendorid() {
    return vendorid;
  }

  public void setVendorid(int vendorid) {
    this.vendorid = vendorid;
  }


  public String getSupname() {
    return supname;
  }

  public void setSupname(String supname) {
    this.supname = supname;
  }


  public int getSuptype() {
    return suptype;
  }

  public void setSuptype(int suptype) {
    this.suptype = suptype;
  }


  public String getBuyer() {
    return buyer;
  }

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }


  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public double getAllpayment() {
    return allpayment;
  }

  public void setAllpayment(double allpayment) {
    this.allpayment = allpayment;
  }


  public double getCurrent() {
    return current;
  }

  public void setCurrent(double current) {
    this.current = current;
  }


  public double getPrepayment() {
    return prepayment;
  }

  public void setPrepayment(double prepayment) {
    this.prepayment = prepayment;
  }


  public double getNowpay() {
    return nowpay;
  }

  public void setNowpay(double nowpay) {
    this.nowpay = nowpay;
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
