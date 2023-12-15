package com.example.mywhatsapp.Model;

public class MessageModel {
    String uId,Message;
    Long timeStamp;

    public MessageModel(String uId, String message, Long timeStamp) {
        this.uId = uId;
        Message = message;
        this.timeStamp = timeStamp;

    }
    public MessageModel(){}

    public MessageModel(String uId, String message) {
        this.uId = uId;
        Message = message;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
