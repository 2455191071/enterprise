package com.csdj.enterprise.entity.office;

import java.io.Serializable;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  流程模块表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Module implements Serializable {

     private  int  oId;//编号
     private  String  oName;//模块名

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }
}
