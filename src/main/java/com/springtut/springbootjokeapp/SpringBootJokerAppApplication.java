package com.springtut.springbootjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml") //tells Spring to search the classpath for a file called chuck-config.xml
public class SpringBootJokerAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootJokerAppApplication.class, args);
  }

}
