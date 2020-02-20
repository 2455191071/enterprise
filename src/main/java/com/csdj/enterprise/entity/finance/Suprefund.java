package com.csdj.enterprise.entity.finance;


import java.util.Date;

public class Suprefund {

  private int advanceid;
  private String buyer;
  private Date refundtime;
  private int position;
  private double verefund;
  private double suprefund;
  private double vededuction;
  private double supdeduction;
  private double veactual;
  private double supactual;
  private String note;
  private String A;
  private String B;


  public int getAdvanceid() {
    return advanceid;
  }

  public void setAdvanceid(int advanceid) {
    this.advanceid = advanceid;
  }


  public String getBuyer() {
    return buyer;
  }

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }


  public Date getRefundtime() {
    return refundtime;
  }

  public void setRefundtime(Date refundtime) {
    this.refundtime = refundtime;
  }


  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }


  public double getVerefund() {
    return verefund;
  }

  public void setVerefund(double verefund) {
    this.verefund = verefund;
  }


  public double getSuprefund() {
    return suprefund;
  }

  public void setSuprefund(double suprefund) {
    this.suprefund = suprefund;
  }


  public double getVededuction() {
    return vededuction;
  }

  public void setVededuction(double vededuction) {
    this.vededuction = vededuction;
  }


  public double getSupdeduction() {
    return supdeduction;
  }

  public void setSupdeduction(double supdeduction) {
    this.supdeduction = supdeduction;
  }


  public double getVeactual() {
    return veactual;
  }

  public void setVeactual(double veactual) {
    this.veactual = veactual;
  }


  public double getSupactual() {
    return supactual;
  }

  public void setSupactual(double supactual) {
    this.supactual = supactual;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
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
