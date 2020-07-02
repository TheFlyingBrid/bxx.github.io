package com.sub.entity;

import java.util.Date;

public class News {
    private String id;

    private String title;

    private String status;

    private String author;

    private Date pubtime;

    private Integer viewcount;

    private String img;

    private String menuid;

    public News(String id, String title, String status, String author, Date pubtime, Integer viewcount, String img, String menuid) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.author = author;
        this.pubtime = pubtime;
        this.viewcount = viewcount;
        this.img = img;
        this.menuid = menuid;
    }

    public News() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }
}