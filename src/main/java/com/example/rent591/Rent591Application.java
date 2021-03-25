package com.example.rent591;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Rent591Application {

    public static void main(String[] args) {
        SpringApplication.run(Rent591Application.class, args);
    }

}
