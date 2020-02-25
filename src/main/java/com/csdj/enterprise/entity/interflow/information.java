package com.csdj.enterprise.entity.interflow;

public class information {
    private int lid;    //栏目表id
    private int ID;     //编号
    private String title;     //标题
    private String attachment;     //附件
    private String founder ;     //创建人
    private String Creation;     //创建时间

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getCreation() {
        return Creation;
    }

    public void setCreation(String creation) {
        Creation = creation;
    }
}
