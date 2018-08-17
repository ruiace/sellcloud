package com.ruipeng.cloud.controller;

import com.ruipeng.cloud.message.StreamClient;

import com.ruipeng.cloud.vo.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.o;

/**
 * Created by JF on 2018/8/17.
 */
@RestController
@EnableBinding(StreamClient.class)
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendout")
    public String sendMessage(){

       //
        // String string ="test-----------";

        OrderDTO dto = new OrderDTO();
        dto.setBuyerName("测试");
        dto.setBuyerPhone("12345678963");

        boolean send = streamClient.output().send(MessageBuilder.withPayload(dto).build());
        return "成功";
    }

}
