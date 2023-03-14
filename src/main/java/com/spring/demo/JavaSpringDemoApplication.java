package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpringDemoApplication {

	@GetMapping("/message")
	public String message() {
		return "Hello.. I am deployed.. !";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringDemoApplication.class, args);
	}

}
