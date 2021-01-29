package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieStarter {

	public static void main(String[] args) {
		SpringApplication.run(MovieStarter.class, args);
		System.out.println("========================================");
		System.out.println("=========MovieService Started===========");
		System.out.println("========================================");
	}
}
