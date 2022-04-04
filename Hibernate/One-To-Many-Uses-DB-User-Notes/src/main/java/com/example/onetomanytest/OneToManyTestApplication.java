package com.example.onetomanytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.*")
public class OneToManyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyTestApplication.class, args);
    }

}
