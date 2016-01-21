package com.clipperworks;

import java.util.Date;

/**
 * Created by sungjin.kim on 2016-01-21.
 */
public class OutputMessage extends Message {
    private Date time;

    public OutputMessage(Message origin, Date time) {
        super(origin.getName(), origin.getMessage());
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}