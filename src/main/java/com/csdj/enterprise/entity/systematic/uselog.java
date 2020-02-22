package com.csdj.enterprise.entity.systematic;

public class uselog {
    private int logId;//用户id
    private String personnel;//登录人员
    private String intime;//开始时间
    private String totime;//结束时间
    private String ipAddress;//ip地址
    private String medium;//媒介
    private String cancellationtime;//注销时间
    private String state;//状态
    private String IP_conflict;//冲突Ip
    private int requests;//请求次数

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getTotime() {
        return totime;
    }

    public void setTotime(String totime) {
        this.totime = totime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getCancellationtime() {
        return cancellationtime;
    }

    public void setCancellationtime(String cancellationtime) {
        this.cancellationtime = cancellationtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIP_conflict() {
        return IP_conflict;
    }

    public void setIP_conflict(String IP_conflict) {
        this.IP_conflict = IP_conflict;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }
}
