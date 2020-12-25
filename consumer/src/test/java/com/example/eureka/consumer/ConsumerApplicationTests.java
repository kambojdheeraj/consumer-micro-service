package com.example.eureka.consumer;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.eureka.consumer.component.ClientConsumer;

@SpringBootTest
class ConsumerApplicationTests {

	@Autowired
	private ClientConsumer consumer;
	
	  @Test
	   public void doConsumerTest(){
	      System.out.println (consumer.getService());
	   } 

}
