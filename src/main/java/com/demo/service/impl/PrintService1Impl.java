package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import com.demo.service.PrintService1;

@Component
public class PrintService1Impl implements PrintService1 {

	@Autowired
	MessageChannel channel1;
	
	@ServiceActivator
	public String print(String str) {
		System.out.println("printing from service1...." + str);

      // create a message with the content "Hello World"
      Message<String> message = MessageBuilder.withPayload("Hello World").build();

      // send the message to the inputChannel
      channel1.send(message);
		
	  return str + " India";
		
		
	}

}
