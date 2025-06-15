package com.example.time_topic_producer;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TimeTopicProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeTopicProducerApplication.class, args);
    }

    @Bean
    public Supplier<String> timeSupplier() {
        return () -> "Current time: " + System.currentTimeMillis();
    }
}
