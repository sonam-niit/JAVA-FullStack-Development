package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn")
public class ApiTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTwoApplication.class, args);
	}

}
