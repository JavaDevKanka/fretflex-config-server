package ru.konkatenazia.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class KankaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KankaServerApplication.class, args);
    }

}
