package com.mumsched;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroservNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservNotificationApplication.class, args);
	}
}
@RestController
class Greeting {
	@RequestMapping("")
	String greeting(){
		return "Greeting from notification - service";
		
	}
	
	@RequestMapping("/aval")
	String availabe(){
		return " I am available";
		
	}
}
