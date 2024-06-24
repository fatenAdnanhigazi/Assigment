package com.niq.activate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.niq.activate.entity"})
@EnableJpaRepositories(basePackages = {"com.niq.activate.repository"})
public class ActivateApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActivateApplication.class, args);
    }
}
