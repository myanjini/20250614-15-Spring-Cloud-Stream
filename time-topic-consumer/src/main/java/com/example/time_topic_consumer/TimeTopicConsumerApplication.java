package com.example.time_topic_consumer;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TimeTopicConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeTopicConsumerApplication.class, args);
    }

    @Bean
    public Consumer<String> timeConsumer() {
        return time -> System.out.println(">>> Consumed time: " + time);
    }
}
