package com.sub.entity;

import java.util.Date;

public class HomeWork {
    private String id;

    private Date pubtime;

    private String title;

    private String userid;

    private String description;

    public HomeWork(String id, Date pubtime, String title, String userid, String description) {
        this.id = id;
        this.pubtime = pubtime;
        this.title = title;
        this.userid = userid;
        this.description = description;
    }

    public HomeWork() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}