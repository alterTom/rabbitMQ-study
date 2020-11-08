package com.sundun.zook.rabbitmqstudy;

import org.junit.jupiter.api.Test;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = RabbitMqStudyApplication.class)
class RabbitMqStudyApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Test
	public void sendHelloWorldTest(){
		rabbitTemplate.convertAndSend("hello","hello world");
	}

	@Test
	public void sendWorkMessage(){
		for (int i = 0; i < 20; i++) {
			rabbitTemplate.convertAndSend("work","work模型");
		}
	}


	@Test
	public void sendFanoutMessage(){
		rabbitTemplate.convertAndSend("logs","","Fanout的模型发送消息");
	}


	@Test
	public void sendRouteMessage(){
		rabbitTemplate.convertAndSend("directs","error","发送的是error的路由的信息");
	}


	@Test
	public void sendTopicMessage(){
		rabbitTemplate.convertAndSend("topics","product.save.order","product.save.order 的路由消息");
	}








}
