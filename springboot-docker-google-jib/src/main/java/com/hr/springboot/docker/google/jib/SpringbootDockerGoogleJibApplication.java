package com.hr.springboot.docker.google.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerGoogleJibApplication {

	@GetMapping
	public String message()
	{
		return "This application is dockerized using Google Jib ";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerGoogleJibApplication.class, args);
	}

}
