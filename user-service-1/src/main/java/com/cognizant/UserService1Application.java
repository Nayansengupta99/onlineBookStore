package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cognizant.*")
public class UserService1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserService1Application.class, args);
	}

}
