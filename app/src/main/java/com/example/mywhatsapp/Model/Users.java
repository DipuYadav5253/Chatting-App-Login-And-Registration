package com.example.mywhatsapp.Model;

public class Users {
    String profilePic,mail,userName,userId,password,lastMessage;

    public Users(String profilePic, String mail, String userName, String userId, String password, String lastMessage) {
        this.profilePic = profilePic;
        this.mail = mail;
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.lastMessage = lastMessage;
    }
    public Users(){}

    public Users( String userName, String mail, String password  ) {

        this.mail = mail;
        this.userName = userName;

        this.password = password;

    }



    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId(String key) {
        return userId;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
