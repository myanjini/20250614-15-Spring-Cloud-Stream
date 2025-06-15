package com.example.inventory_service;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public Consumer<OrderCreated> inventoryConsumer() {
        // TODO: 데이터베이스에 재고 차감 로직 구현
        return order -> {
            System.out.println(">>> 재고 차감: " + order.getOrderId() + ", Product: "
                    + order.getProductName());

        };
    }
}
