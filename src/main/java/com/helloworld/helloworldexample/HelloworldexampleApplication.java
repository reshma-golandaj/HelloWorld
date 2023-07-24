package com.helloworld.helloworldexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldexampleApplication.class, args);
        System.out.println("Hello World ");
	}

}

