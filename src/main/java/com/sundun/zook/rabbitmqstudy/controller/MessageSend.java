package com.sundun.zook.rabbitmqstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class MessageSend {

    @GetMapping("/message")
    public void messageSend(){

        System.out.println("hello world");
    }


}
