package com.example.backend_api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class BackendApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendApiApplication.class, args);
		System.out.println("Rodando API Backend");
	}

}
