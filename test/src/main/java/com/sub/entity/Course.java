package com.sub.entity;

import java.util.Date;

public class Course {
    private String id;

    private String name;

    private String filename;

    private String status;

    private String author;

    private Date pubtime;

    private String img;

    private String flashfilename;

    private Integer viewcount;

    private String filetype;

    private String menuid;

    public Course(String id, String name, String filename, String status, String author, Date pubtime, String img, String flashfilename, Integer viewcount, String filetype, String menuid) {
        this.id = id;
        this.name = name;
        this.filename = filename;
        this.status = status;
        this.author = author;
        this.pubtime = pubtime;
        this.img = img;
        this.flashfilename = flashfilename;
        this.viewcount = viewcount;
        this.filetype = filetype;
        this.menuid = menuid;
    }

    public Course() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getFlashfilename() {
        return flashfilename;
    }

    public void setFlashfilename(String flashfilename) {
        this.flashfilename = flashfilename == null ? null : flashfilename.trim();
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }
}