package com.tutorialspoint.sprintbooth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.tutorialspoint.controller","com.tutorialspoint.service"})
@EntityScan("com.tutorialspoint.entity")
@EnableJpaRepositories("com.tutorialspoint.repository")
@SpringBootApplication
public class SprintBootH2Application {
   public static void main(String[] args) {
      SpringApplication.run(SprintBootH2Application.class, args);
   }
}