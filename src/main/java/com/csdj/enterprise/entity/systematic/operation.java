package com.csdj.enterprise.entity.systematic;
/*
 * 曾勇彪
 * */
public class operation {
    private int operationId;//操作号id
    private String datetimes;   //日期时间
    private String acttype;   //动作类型
    private int dataId;   //数据表Id
    private String data_summary;   //数据摘要
    private String personnel;   //操作人员
    private String client_IP;   //客户端ip

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getDatetimes() {
        return datetimes;
    }

    public void setDatetimes(String datetimes) {
        this.datetimes = datetimes;
    }

    public String getActtype() {
        return acttype;
    }

    public void setActtype(String acttype) {
        this.acttype = acttype;
    }

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public String getData_summary() {
        return data_summary;
    }

    public void setData_summary(String data_summary) {
        this.data_summary = data_summary;
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public String getClient_IP() {
        return client_IP;
    }

    public void setClient_IP(String client_IP) {
        this.client_IP = client_IP;
    }
}
