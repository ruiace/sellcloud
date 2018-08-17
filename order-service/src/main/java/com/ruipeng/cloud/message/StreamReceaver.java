package com.ruipeng.cloud.message;

import com.ruipeng.cloud.vo.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * Created by JF on 2018/8/17.
 */
@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceaver {


    @StreamListener("myMessage")
    @SendTo("myMessage2")
    public OrderDTO reseaveMessage(OrderDTO message){
        log.info("message================>{}", message);
        return message;
    }


    @StreamListener("myMessage2")
    public void reseaveMessage2(OrderDTO message){
        log.info("message======333333==========>{}", message);
    }
}
