package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.simplilearn.controllers.MainController;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn")
public class Springbootdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo1Application.class, args);
	}

}
