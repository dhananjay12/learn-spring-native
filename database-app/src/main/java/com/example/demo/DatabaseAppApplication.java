package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@TypeHints(
//        @TypeHint(typeNames = "org.hibernate.dialect.MySQL8Dialect", types = MySQL8Dialect.class) // Need to specify if using MySQL5InnoDB
//)
public class DatabaseAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseAppApplication.class, args);
    }

}
