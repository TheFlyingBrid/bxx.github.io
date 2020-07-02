package com.sub.entity;

import java.util.Date;

public class UserHomeWork {
    private String id;

    private Date updatetime;

    private String homeworkid;

    private String userid;

    private String content;

    public UserHomeWork(String id, Date updatetime, String homeworkid, String userid, String content) {
        this.id = id;
        this.updatetime = updatetime;
        this.homeworkid = homeworkid;
        this.userid = userid;
        this.content = content;
    }

    public UserHomeWork() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(String homeworkid) {
        this.homeworkid = homeworkid == null ? null : homeworkid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}