package com.sundun.zook.rabbitmqstudy.mq.rabbitmq.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutConsumer {


    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,  //queue 不指定名称, 创建临时的队列
                    exchange = @Exchange(value = "logs",type = ExchangeTypes.FANOUT) //绑定交换机
            )
    })
    public void receive1(String message){
        System.out.println("message1: " + message);
    }



    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "logs",type = ExchangeTypes.FANOUT)
            )
    })
    public void receive2(String message){
        System.out.println("message2: " + message);
    }



}
