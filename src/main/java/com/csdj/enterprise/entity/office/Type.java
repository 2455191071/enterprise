package com.csdj.enterprise.entity.office;

import java.io.Serializable;

/**
 * @ClassName StuClass
 * @Description
 * @Author 李仕鹏  任务类型表
 * @Date 2019/12/30 8:25
 * @Version 1.0
 **/
public class Type  implements Serializable {
    private  int  eId;//编号
    private  String eName;//类型名称

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
