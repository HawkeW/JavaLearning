package com.yidu;

public class User {

    private String Id;
    private String userId;
    private String userName;
    private String email;
    private String password;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
