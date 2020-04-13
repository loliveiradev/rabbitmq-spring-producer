package com.example.spring.producer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.producer.amqp.AmqpProducer;
import com.example.spring.producer.dto.MessageQueue;
import com.example.spring.producer.service.AmqpService;

@Service
public class RabbitMQServiceImpl implements AmqpService{
	
	@Autowired
	private AmqpProducer<MessageQueue> amqp;

	@Override
	public void sendToConsumer(MessageQueue message) {
		amqp.producer(message);
		
	}

}
