package com.ruipeng.cloud.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * Created by JF on 2018/8/17.
 */

public interface StreamClient {


   /* @Input("myMessage")
    SubscribableChannel input();*/

    @Output("myMessage")
    MessageChannel output();

    @Output("myMessage2")
    MessageChannel output2();

}
