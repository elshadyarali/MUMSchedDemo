package com.mumsched;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class MicroservUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservUsersApplication.class, args);
	}
	
	@RestController
	class Greeting {
		
		@Autowired
		RestTemplate restTemplate;
		
		@RequestMapping("")
		String greeting(){
			return "Greeting from user- service";
			
		}
		
		@HystrixCommand(fallbackMethod = "down")
		@RequestMapping("/notfstatus")
		String checkAvalability(){
			return restTemplate.getForObject("http://localhost:9090/notification-microservice/aval", String.class);
			
		}
		
		  public String down() {
			    return "Notification Service is not available ";
			  }
		
		
		
	}
	
	
	
	
	 @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	    return builder.build();
	  }
}




