package com.airbnb.charity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharityApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CharityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
