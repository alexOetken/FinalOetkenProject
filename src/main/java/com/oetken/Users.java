package com.oetken;

public class Users {

    private String Email;

    private String firstName;

    private String lastName;

    private String uniqueLogId;

    private String roles;


    public Users() {}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Users(String email, String firstName, String lastName, String uniqueLog, String roles) {
        this.Email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueLogId = uniqueLog;
        this.roles = roles;
    }
}
