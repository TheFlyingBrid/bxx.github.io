package com.sub.entity;

public class Answer {
    private String id;

    private String status;

    private String topicid;

    private String userid;

    private String content;

    public Answer(String id, String status, String topicid, String userid, String content) {
        this.id = id;
        this.status = status;
        this.topicid = topicid;
        this.userid = userid;
        this.content = content;
    }

    public Answer() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
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