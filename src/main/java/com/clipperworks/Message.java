package com.clipperworks;

/**
 * Created by sungjin.kim on 2016-01-20.
 */
public class Message {
    private String name;
    private String message;

    public Message() { }

    public Message(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}