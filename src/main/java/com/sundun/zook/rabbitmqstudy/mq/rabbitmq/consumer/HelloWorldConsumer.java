package com.sundun.zook.rabbitmqstudy.mq.rabbitmq.consumer;


import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.lang.model.element.NestingKind;

@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class HelloWorldConsumer {

    @RabbitHandler
    public void receive1(String message){

        System.out.println("message: " + message);

    }


}
