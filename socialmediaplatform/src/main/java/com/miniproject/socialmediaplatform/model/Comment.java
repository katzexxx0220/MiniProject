package com.miniproject.socialmediaplatform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "comment")
public class Comment {
    @Id  
    private String id; 
    private String userId;
    private String comment;
    private String postId;
    private long createdAt;
    private Date createdDate;

    public Comment(String userId, String comment, String postId, long createdAt, Date createdDate){
        this.userId = userId;
        this.comment = comment;
        this.postId = postId;
        this.createdAt = System.currentTimeMillis() / 1000;
        this.createdDate = new Date(this.createdAt * 1000);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }

    public String toString() {
        return "userId = " + userId + ", comment = " + comment + 
        ", postId = " + postId + ", createdAt = " + createdAt + ", createdDate = " + createdDate;
    }
}
