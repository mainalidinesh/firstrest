package com.shreejay.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ("com.shreejay")
public class FirstrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
	}

}
