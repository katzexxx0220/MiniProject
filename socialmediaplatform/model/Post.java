package com.miniproject.socialmediaplatform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "post")
public class Post {
    @Id
    private String id;
    private String title;
    private String mediaUrl;
    private String userId;
    private String username;
    private String profilePicture;
    private long createdAt;

    public Post(){
        this.createdAt = System.currentTimeMillis() / 1000;
    }
    
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedDate(){
        return new Date(createdAt * 1000);
    }

    public String toString() {
        return "title = " + title + ", mediaUrl = '" + mediaUrl + ", userId = " + userId + ", username = " + 
        username + ", profilePicture = " + profilePicture + ", createdAt = " + createdAt;
    }
}