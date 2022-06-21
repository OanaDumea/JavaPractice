package com.example.TravelBlog.model;

import java.util.Date;

public class PostComment {

    private int post_comment_id;
    private int post_id;
    private int parent_id;
    private int published;
    private Date createdAt;
    private Date publishedAt;

    public int getPost_comment_id() {
        return post_comment_id;
    }

    public void setPost_comment_id(int post_comment_id) {
        this.post_comment_id = post_comment_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
