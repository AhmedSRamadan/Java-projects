package com.example.demostart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemostartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemostartApplication.class, args);
		
		System.out.println("Hello World");
	}
}
