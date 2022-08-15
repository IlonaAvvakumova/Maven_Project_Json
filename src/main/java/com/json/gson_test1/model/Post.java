package com.json.gson_test1.model;

import java.util.List;

public class Post {

    private Integer id;
    private String content;
    private  String updated;
    List<Label> labels;

    public Post(Integer id, String content, String updated, List<Label> labels) {
        this.id = id;
        this.content = content;
        this.updated = updated;
        this.labels = labels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", updated='" + updated + '\'' +
                ", labels=" + labels +
                '}';
    }
}
