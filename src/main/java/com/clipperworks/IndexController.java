package com.clipperworks;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by sungjin.kim on 2016-01-20.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() { return "index"; }

    @MessageMapping("/chat")
    @SendTo("/topic/message")
    public Message response(Message message) throws Exception {
        Thread.sleep(2000);
        return new OutputMessage(message, new Date());
    }
}