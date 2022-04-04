package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spring.test.*")
public class SpringBootRestHateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestHateoasApplication.class, args);
	}

}
