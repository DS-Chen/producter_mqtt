package com.chen.mqtt.controller;

import com.chen.mqtt.config.MsgWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cds
 * @create 2018-11-14 14:10
 * @description
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/send")
public class SendController {

    @Autowired
    private MsgWriter msgWriter;

    @RequestMapping(value = "/too", method = RequestMethod.GET, produces = {"application/json"})
    public String sender() {
        msgWriter.sendToMqtt("我是中囯人", "too");
        return "OK";
    }
}
