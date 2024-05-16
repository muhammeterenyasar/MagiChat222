package com.example.magichat2;

public class UserModel {
    String userID;
    String userPassword;
    String userName;
    String userEmail;

    public UserModel(String userID,String userEmail,String userName, String userPassword)
    {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userEmail = userEmail;
    }
    public UserModel(){

    }

    public String getUserID(){
        return userID;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserEmail(){
        return userEmail;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
