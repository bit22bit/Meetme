package com.example.meetme.models;

public class Chat {

    private String sender;
    private String receiver;
    private String message;

    public Chat(String sender, String reciever, String message) {
        this.sender = sender;
        this.receiver = reciever;
        this.message = message;
    }

    public Chat(){
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String reciever) {
        this.receiver = reciever;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
