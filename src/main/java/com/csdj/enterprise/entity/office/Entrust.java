package com.csdj.enterprise.entity.office;

import java.io.Serializable;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  委托表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Entrust  implements Serializable {

     private int uId;// 编号
     private  int uNamew;//委托人【员工表】
     private  int uNames;//受托人【员工表】
     private   String uEnt; //是否暂停委托【是  否】

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getuNamew() {
        return uNamew;
    }

    public void setuNamew(int uNamew) {
        this.uNamew = uNamew;
    }

    public int getuNames() {
        return uNames;
    }

    public void setuNames(int uNames) {
        this.uNames = uNames;
    }

    public String getuEnt() {
        return uEnt;
    }

    public void setuEnt(String uEnt) {
        this.uEnt = uEnt;
    }
}
