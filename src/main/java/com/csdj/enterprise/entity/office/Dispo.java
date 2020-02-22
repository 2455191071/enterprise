package com.csdj.enterprise.entity.office;

import java.io.Serializable;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  流程处理表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Dispo implements Serializable {
    private int vId; //编号
    private int vProcess; //流程【流程表】
    private String vApproval; //审批
    private int vName;//审批人【员工表】
    private String vText;//备注

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public int getvProcess() {
        return vProcess;
    }

    public void setvProcess(int vProcess) {
        this.vProcess = vProcess;
    }

    public String getvApproval() {
        return vApproval;
    }

    public void setvApproval(String vApproval) {
        this.vApproval = vApproval;
    }

    public int getvName() {
        return vName;
    }

    public void setvName(int vName) {
        this.vName = vName;
    }

    public String getvText() {
        return vText;
    }

    public void setvText(String vText) {
        this.vText = vText;
    }
}
