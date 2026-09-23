package com.route.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RouteBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteBackendApplication.class, args);
    }
}
