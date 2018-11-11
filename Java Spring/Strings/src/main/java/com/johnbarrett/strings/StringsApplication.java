package com.johnbarrett.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello client! You are the best client anybody could have asked for!";
	}
		
	@RequestMapping("/random")
	public String greeting() {
		return "Spring Boot is alright so far, but Maven install was kinda sketchy!";
		
	}
}