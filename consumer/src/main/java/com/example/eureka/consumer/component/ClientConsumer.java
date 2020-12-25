package com.example.eureka.consumer.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
@RequestMapping(path = "/consumer", produces = "application/json")
@CrossOrigin(origins = "*")
public class ClientConsumer {

	@Autowired
	private RestTemplate rest;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	return new RestTemplate();
	}

	@GetMapping("/value")
	public String getService() {
		return rest.getForObject("http://client-service/client/service", String.class);
	}
}
