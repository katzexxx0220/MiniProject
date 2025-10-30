package com.miniproject.socialmediaplatform.model;

public class LoginMessage {
    private boolean success;
    private String message;

    public LoginMessage(boolean success, String message){
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "success = " + success + ", message = " + message;
    }
}
