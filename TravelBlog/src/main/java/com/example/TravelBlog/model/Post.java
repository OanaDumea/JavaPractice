package com.example.TravelBlog.model;

import java.util.Date;

public class Post {

    public class post {
        private int user_id;
        private String title;
        private String metaTitle;
        private String slug;
        private String summary;
        private String published;
        private Date createdAt;
        private Date updatedAt;
        private Date publishedAt;
        private String content;
        private int post_id;

        public int getUser_id() {
            return user_id;
        }

        public String getTitle() {
            return title;
        }

        public String getMetaTitle() {
            return metaTitle;
        }

        public String getSlug() {
            return slug;
        }

        public String getSummary() {
            return summary;
        }

        public String getPublished() {
            return published;
        }

        public Date getCreatedAt() {
            return createdAt;
        }

        public Date getUpdatedAt() {
            return updatedAt;
        }

        public Date getPublishedAt() {
            return publishedAt;
        }

        public String getContent() {
            return content;

        }
    }
}