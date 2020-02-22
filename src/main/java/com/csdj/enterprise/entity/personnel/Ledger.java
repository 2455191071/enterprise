package com.csdj.enterprise.entity.personnel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 李金艳
 * @Date: 2020/02/20/12:02
 * @Description:列表考勤台账（个人）实体类
 */
public class Ledger {
    private int ledgerId;//台账编号
    private String date;//日期
    private int clerkId;//职员
    private String scheType;//排班类型
    private String overtime;//加班
    private String mendWork;//补班
    private String late;//迟到
    private String early;//早退
    private int leakageSign;//漏签到(次)
    private int absenteeism;//旷工（次）
    private String totaltime;//总时长
    private String casualleave;//事假
    private String sickleave;//病假
    private String outing;//外出
    private String evection;//出差
    private int money;//金额
    private String dayrate;//日倍率

    public int getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(int ledgerId) {
        this.ledgerId = ledgerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getClerkId() {
        return clerkId;
    }

    public void setClerkId(int clerkId) {
        this.clerkId = clerkId;
    }

    public String getScheType() {
        return scheType;
    }

    public void setScheType(String scheType) {
        this.scheType = scheType;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public String getMendWork() {
        return mendWork;
    }

    public void setMendWork(String mendWork) {
        this.mendWork = mendWork;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getEarly() {
        return early;
    }

    public void setEarly(String early) {
        this.early = early;
    }

    public int getLeakageSign() {
        return leakageSign;
    }

    public void setLeakageSign(int leakageSign) {
        this.leakageSign = leakageSign;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    public String getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    public String getCasualleave() {
        return casualleave;
    }

    public void setCasualleave(String casualleave) {
        this.casualleave = casualleave;
    }

    public String getSickleave() {
        return sickleave;
    }

    public void setSickleave(String sickleave) {
        this.sickleave = sickleave;
    }

    public String getOuting() {
        return outing;
    }

    public void setOuting(String outing) {
        this.outing = outing;
    }

    public String getEvection() {
        return evection;
    }

    public void setEvection(String evection) {
        this.evection = evection;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDayrate() {
        return dayrate;
    }

    public void setDayrate(String dayrate) {
        this.dayrate = dayrate;
    }
}