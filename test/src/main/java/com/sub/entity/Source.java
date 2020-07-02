package com.sub.entity;

import java.util.Date;

public class Source {
    private String id;

    private String name;

    private String filename;

    private Date pubtime;

    private String userid;

    private String filetype;

    private String description;

    public Source(String id, String name, String filename, Date pubtime, String userid, String filetype, String description) {
        this.id = id;
        this.name = name;
        this.filename = filename;
        this.pubtime = pubtime;
        this.userid = userid;
        this.filetype = filetype;
        this.description = description;
    }

    public Source() {
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

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}