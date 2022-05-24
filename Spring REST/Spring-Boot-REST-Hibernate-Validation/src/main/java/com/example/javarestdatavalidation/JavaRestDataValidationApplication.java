package com.example.javarestdatavalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author dev30015
 * This application is intended to use to test the validation ONLY.
 */
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //uncomment if using mocked DB
@SpringBootApplication
public class JavaRestDataValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaRestDataValidationApplication.class, args);
    }

}
