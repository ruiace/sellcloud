package com.ruipeng.cloud.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by JF on 2018/8/17.
 */
@Component
@Slf4j
public class MyReseave {

    @RabbitListener(queues="myqueues") //不会自动创建队列
    public void reseave(String msg){
        log.info("------------------------------------->"+msg);
    }

    @RabbitListener(queuesToDeclare= @Queue("myqueues1")) //自动创建队列
    public void reseave1(String msg){
        log.info("------------------------------------->"+msg);
    }



    //==============================================================================



    @RabbitListener(bindings=@QueueBinding(
            value=@Queue("myqueue3"),
            exchange = @Exchange("myexchange"),
            key="test"
    )) //QueueBinding[] bindings() d
    public void reseave2(String msg){
        log.info("------------------------------------->"+msg);
    }

    @RabbitListener(bindings=@QueueBinding(
            value=@Queue("myqueue3"),
            exchange = @Exchange("myexchange"),
            key="result"
    )) //QueueBinding[] bindings() d
    public void reseave3(String msg){
        log.info("------------------------------------->"+msg);
    }


    @RabbitListener(bindings=@QueueBinding(
            value=@Queue("myqueue4"),
            exchange = @Exchange("myexchange"),
            key="result"
    )) //QueueBinding[] bindings() d
    public void reseave4(String msg){
        log.info("------------------------------------->"+msg);
    }

    @RabbitListener(bindings=@QueueBinding(
            value=@Queue("myqueue4"),
            exchange = @Exchange("myexchange2"),
            key="result"
    )) //QueueBinding[] bindings() d
    public void reseave5(String msg){
        log.info("------------------------------------->"+msg);
    }

}
