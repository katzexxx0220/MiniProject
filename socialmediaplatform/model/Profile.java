package com.miniproject.socialmediaplatform.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.miniproject.socialmediaplatform.PasswordHashing;

@Document(collection = "profile")
public class Profile {
    @Id
    private String id;
    private String username;
    private String profilePicture;
    private long createdAt;
    private String password;

    public Profile(){
        this.createdAt = System.currentTimeMillis() / 1000;
    }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordHashing.hash(password);
    }

    public Date getCreatedDate(){
        return new Date(createdAt * 1000);
    }

    public String toString() {
        return "id = " + id + ", username = " + username + ", profilePicture = " + profilePicture 
        + ", createdAt = " + createdAt;
    }
}