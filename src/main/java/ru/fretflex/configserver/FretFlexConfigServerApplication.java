package ru.fretflex.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FretFlexConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FretFlexConfigServerApplication.class, args);
    }
}
