package com.mumsched;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
public class CourseBootApplication {
	
   public static void main(String[] args) {
			SpringApplication.run(CourseBootApplication.class, args);
		}
	

}
@RestController
class Greeting {
	@RequestMapping("")
	String greeting(){
		return "Greeting from courses- service";
		
	}
}