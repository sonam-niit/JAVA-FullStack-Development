package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.controllers")
public class SpringfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfilesApplication.class, args);
	}

}
