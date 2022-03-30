package com.example.happidocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HappiDockerApplication {

	@GetMapping("/hello")
	public String getGreeting() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HappiDockerApplication.class, args);
	}

}
