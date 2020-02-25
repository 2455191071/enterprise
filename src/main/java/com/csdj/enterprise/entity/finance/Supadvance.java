package com.csdj.enterprise.entity.finance;


import java.util.Date;

public class Supadvance {

  private int advanceid;
  private String supplier;
  private String buyer;
  private String note;
  private int paytype;
  private String payment;
  private String payaccount;
  private String attachment;
  private Date payterm;
  private double amount;
  private int position;
  private String accounts;
  private String bank;
  private String A;
  private String B;


  public int getAdvanceid() {
    return advanceid;
  }

  public void setAdvanceid(int advanceid) {
    this.advanceid = advanceid;
  }


  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public String getBuyer() {
    return buyer;
  }

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public int getPaytype() {
    return paytype;
  }

  public void setPaytype(int paytype) {
    this.paytype = paytype;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public String getPayaccount() {
    return payaccount;
  }

  public void setPayaccount(String payaccount) {
    this.payaccount = payaccount;
  }


  public String getAttachment() {
    return attachment;
  }

  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }


  public Date getPayterm() {
    return payterm;
  }

  public void setPayterm(Date payterm) {
    this.payterm = payterm;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }


  public String getAccounts() {
    return accounts;
  }

  public void setAccounts(String accounts) {
    this.accounts = accounts;
  }


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
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
