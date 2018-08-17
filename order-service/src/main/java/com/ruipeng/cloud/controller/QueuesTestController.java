package com.ruipeng.cloud.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JF on 2018/8/17.
 */
@RestController
public class QueuesTestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public String sendTest(){
        rabbitTemplate.convertAndSend("myqueues","test00000000");
        return  "seccess";
    }

    @GetMapping("/send1")
    public String sendTest1(){
        rabbitTemplate.convertAndSend("myqueues1","test111111111111111");
        return  "seccess";
    }

    @GetMapping("/e2m4")
    public String sendTest2(){
        rabbitTemplate.convertAndSend("myexchange2","result","test111144444444444411111111111");
        return  "seccess";
    }

}
