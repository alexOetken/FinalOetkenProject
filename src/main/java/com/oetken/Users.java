package com.oetken;

public class Users {

    private String Email;
    private String uniqueLogId;

    private String roles;


    public Users() {}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUniqueLogId() {
        return uniqueLogId;
    }

    public void setUniqueLogId(String uniqueLogId) {
        this.uniqueLogId = uniqueLogId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Users(String email, String uniqueLog, String roles) {
        this.Email = email;
        this.uniqueLogId = uniqueLog;
        this.roles = roles;
    }
}
