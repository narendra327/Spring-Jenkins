package com.Spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NaredrapppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaredrapppApplication.class, args);
	}
	@GetMapping("/")
	public String Home() {
		return" Spring Jenkins Deployment";
	}

}
