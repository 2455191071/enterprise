package com.csdj.enterprise.entity.storage;
/**
 * 莫宏峡
 * 实体类：会员表
 */
public class Member {
    private String memberId;//会员编号，主键
    private String memberName;//姓名
    private String memberPhone;//  手机号码
    private String  memberGrade;// 会员等级
    private String memberSex;//性别
    private String memberDate;//会员日期
    private String memberEffdate;// 有效日期
    private int memberClient;// 客户
    private int memberIntegral;//积分

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public String getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(String memberDate) {
        this.memberDate = memberDate;
    }

    public String getMemberEffdate() {
        return memberEffdate;
    }

    public void setMemberEffdate(String memberEffdate) {
        this.memberEffdate = memberEffdate;
    }

    public int getMemberClient() {
        return memberClient;
    }

    public void setMemberClient(int memberClient) {
        this.memberClient = memberClient;
    }

    public int getMemberIntegral() {
        return memberIntegral;
    }

    public void setMemberIntegral(int memberIntegral) {
        this.memberIntegral = memberIntegral;
    }
}
