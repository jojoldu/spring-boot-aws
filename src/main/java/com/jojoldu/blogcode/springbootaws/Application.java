package com.jojoldu.blogcode.springbootaws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Value("${db.username}")
    private String dbUserName;

    @Override
    public void run(String... args) throws Exception {
        log.info(">>>>>>>>> ");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
